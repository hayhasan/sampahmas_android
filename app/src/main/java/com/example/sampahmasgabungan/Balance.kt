package com.example.sampahmasgabungan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sampahmasgabungan.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.text.NumberFormat
import java.util.Locale

class Balance : AppCompatActivity() {
    private lateinit var tvPoints: TextView
    private lateinit var tvSaldo: TextView
    private var balanceValueEventListener: ValueEventListener? = null
    private lateinit var databaseReference: DatabaseReference
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance)
        auth = FirebaseAuth.getInstance()
        databaseReference = FirebaseDatabase.getInstance().reference.child("users")
        val currentUser = auth.currentUser
        val userUid = currentUser?.uid
        tvPoints = findViewById(R.id.tvPoint)
        tvSaldo = findViewById(R.id.tvSaldo)
        val backbutton = findViewById<ImageButton>(R.id.iBack)
        val topUpButton = findViewById<ImageButton>(R.id.iTopUp)

        backbutton.setOnClickListener {
            onBackPressed()
        }

        topUpButton.setOnClickListener {
            val intent = Intent(this, Top_Up::class.java)
            startActivity(intent)
        }

        userUid?.let {
            balanceValueEventListener =
                databaseReference.child(it).addValueEventListener(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.exists()) {
                            val name = dataSnapshot.child("name").value.toString()
                            val points = dataSnapshot.child("points").value?.toString() ?: "0"
                            val balance = dataSnapshot.child("balance").value?.toString() ?: "0"

                            tvPoints.text = points
                            tvSaldo.text = numberToCurrency(balance.toDouble())
                        }
                    }

                    override fun onCancelled(databaseError: DatabaseError) {
                        // Handle database error
                    }
                })
        }
    }

    fun numberToCurrency(number: Double): String {
        val localeID = Locale("id", "ID")
        val currencyFormat = NumberFormat.getCurrencyInstance(localeID)
        val formattedValue = currencyFormat.format(number)
        return formattedValue.replace(",", ".")
    }
}