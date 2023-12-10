package com.example.sampahmasgabungan.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.sampahmasgabungan.HomeView
import com.example.sampahmasgabungan.Loading
import com.example.sampahmasgabungan.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.midtrans.sdk.uikit.api.model.Address
import com.midtrans.sdk.uikit.api.model.CustomColorTheme
import com.midtrans.sdk.uikit.api.model.CustomerDetails
import com.midtrans.sdk.uikit.api.model.ItemDetails
import com.midtrans.sdk.uikit.api.model.SnapTransactionDetail
import com.midtrans.sdk.uikit.api.model.TransactionResult
import com.midtrans.sdk.uikit.external.UiKitApi
import com.midtrans.sdk.uikit.internal.util.UiKitConstants
import java.util.UUID

class paymentMidtrans : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var  database: FirebaseDatabase
    private var transactionId:String=UUID.randomUUID().toString()
    private var totalharga:Double=0.0
    private var pointUse:Int=0
    private val launcher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result?.resultCode == RESULT_OK) {
                result.data?.let {
                    val transactionResult = it.getParcelableExtra<TransactionResult>(UiKitConstants.KEY_TRANSACTION_RESULT)
                    Toast.makeText(this, "${transactionResult?.transactionId}", Toast.LENGTH_LONG).show()
                }
            }
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == RESULT_OK) {
            val transactionResult = data?.getParcelableExtra<TransactionResult>(UiKitConstants.KEY_TRANSACTION_RESULT)
            if (transactionResult != null) {
                when (transactionResult.status) {
                    UiKitConstants.STATUS_SUCCESS -> {
                        Toast.makeText(this, "Transaction Finished.", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, Loading::class.java)
                        startActivity(intent)
                    }
                    UiKitConstants.STATUS_PENDING -> {
                        Toast.makeText(this, "Transaction Pending.", Toast.LENGTH_LONG).show()
                    }
                    UiKitConstants.STATUS_FAILED -> {
                        Toast.makeText(this, "Transaction Failed.", Toast.LENGTH_LONG).show()
                    }
                    UiKitConstants.STATUS_CANCELED -> {
                        Toast.makeText(this, "Transaction Cancelled", Toast.LENGTH_LONG).show()
                    }
                    UiKitConstants.STATUS_INVALID -> {
                        Toast.makeText(this, "Transaction Invalid.", Toast.LENGTH_LONG).show()
                    }
                    else -> {
                        Toast.makeText(this, "Transaction Error.", Toast.LENGTH_LONG).show()
                    }
                }

            } else {
                Toast.makeText(this, "Transaction Invalid.", Toast.LENGTH_LONG).show()
            }
        }
        super.onActivityResult(requestCode, resultCode, data)

        finish()
    }

    private fun initTransactionDetails() : SnapTransactionDetail {
        return SnapTransactionDetail(
            orderId = transactionId,
            grossAmount = totalharga-pointUse
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_midtrans2)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()

        // Menerima intent
        val intent = intent

        // Mendapatkan data dari intent
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val alamat = intent.getStringExtra("alamat")
        val kota = intent.getStringExtra("kota")
        val kodepos = intent.getStringExtra("kodepos")
        val nameItem = intent.getStringExtra("nameItem")
        val itemPrice = intent.getDoubleExtra("itemPrice", 0.0)
        val jumlahItem = intent.getIntExtra("jumlahItem", 0)
        pointUse = intent.getIntExtra("pointuse", 0)
        totalharga = intent.getDoubleExtra("totalharga", 0.0)
        val shippingAddress = Address(
            username,  // First Name
            null,  // Last Name
            alamat,  // Address
            kota,  // City
            kodepos,  // PostCode
            null,  // Phone Number
            null // Country Code
        )


        var customerDetails = CustomerDetails(
            firstName = username,
            customerIdentifier = email,
            email = email,
            shippingAddress = shippingAddress
        )
        var itemDetails = listOf(ItemDetails("barang-"+jumlahItem.toString(), itemPrice, jumlahItem, nameItem), ItemDetails("voucher-"+jumlahItem.toString(), (-pointUse.toDouble()), 1, "Point"))

        val historyRef = database.reference.child("history").child(auth.currentUser!!.uid).child(transactionId)

        val newOrder = mapOf(
            "orderId" to transactionId,  // Replace with the actual order ID
            "datetime" to "2023-01-10",
            "totalamount" to totalharga,
            "pointuse" to pointUse,
            "status" to "Unpaid",
            "items" to mapOf(
                "product" to mapOf(
                    "name" to nameItem,
                    "quantity" to jumlahItem,
                    "price" to itemPrice
                )
            )
        )
        historyRef.setValue(newOrder)


        buildUiKit()
        UiKitApi.getDefaultInstance().startPaymentUiFlow(
            activity = this@paymentMidtrans,
            launcher = launcher,
            transactionDetails = initTransactionDetails(),
            customerDetails = customerDetails,
            itemDetails = itemDetails
        )
    }

    private fun buildUiKit() {
        UiKitApi.Builder()
            .withContext(this.applicationContext)
            .withMerchantUrl("https://sampahmastest.000webhostapp.com/index.php/")
            .withMerchantClientKey("SB-Mid-client-Bm1minQ11vE6w4XE")
            .enableLog(true)
            .withColorTheme(CustomColorTheme("#000000", "#000000", "#FF0000"))
            .build()
        uiKitCustomSetting()
        supportActionBar?.hide()
    }

    private fun uiKitCustomSetting() {
        val uIKitCustomSetting = UiKitApi.getDefaultInstance().uiKitSetting
        uIKitCustomSetting.saveCardChecked = true
    }
}