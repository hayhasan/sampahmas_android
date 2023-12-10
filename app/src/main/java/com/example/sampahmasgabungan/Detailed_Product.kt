package com.example.sampahmasgabungan

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider

class Detailed_Product : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_product)

        val loveId = findViewById<CardView>(R.id.loveId)

        loveId.setOnClickListener {
            toggleWishlistStatus()
        }

        val backbutton = findViewById<ImageButton>(R.id.iBack)
        backbutton.setOnClickListener {
            onBackPressed()
        }

        val recommended = intent.getParcelableExtra<ProductVariable>("recommended")
        if (recommended !=null){
            val imageObj: ImageView = findViewById(R.id.imageObj)
            val titleid: TextView = findViewById(R.id.titleid)
            val hargaId: TextView = findViewById(R.id.hargaId)
            val desId: TextView = findViewById(R.id.desId)
            val objName: TextView = findViewById(R.id.objName)
            val titleInside: TextView = findViewById(R.id.titleInside)

            imageObj.setImageResource(recommended.image)
            titleid.text = recommended.title
            objName.text = recommended.title
            titleInside.text = recommended.title
            hargaId.text = recommended.price
            desId.text = recommended.description
        }

        val buyNowButton = findViewById<Button>(R.id.buyNow)
        buyNowButton.setOnClickListener {
            val intent = Intent(this, Checkout_Detail::class.java)
            intent.putExtra("recommended", recommended)
            startActivity(intent)
            finish()

        }

    }

    private fun toggleWishlistStatus() {
        val wishListData = intent.getParcelableExtra<ProductVariable>("recommended")
        if (WishlistData.wishlist.contains(wishListData)) {
            // Already in wishlist, remove it
            if (wishListData != null) {
                WishlistData.removeFromWishlist(wishListData)
            }
            showToast("Product removed from wishlist")
            val loveId = findViewById<CardView>(R.id.loveId)
            loveId.setCardBackgroundColor(Color.parseColor("#FFFFFF"))
        } else {
            // Not in wishlist, add it
            if (wishListData != null) {
                WishlistData.addToWishlist(wishListData)
            }
            showToast("Product added to wishlist")
            val loveId = findViewById<CardView>(R.id.loveId)
            loveId.setCardBackgroundColor(Color.parseColor("#FF4444"))
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}