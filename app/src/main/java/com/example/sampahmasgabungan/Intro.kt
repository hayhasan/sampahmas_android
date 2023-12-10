package com.example.sampahmasgabungan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        supportActionBar?.hide()

        val animationRotate = findViewById<ImageView>(R.id.introAnimation)
        val rotate = RotateAnimation(
            -10f, 10f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
        rotate.duration = 500
        rotate.interpolator = LinearInterpolator()
        rotate.repeatMode = Animation.REVERSE
        rotate.repeatCount = Animation.INFINITE

        animationRotate.startAnimation(rotate)

        val signinGoogleButton = findViewById<CardView>(R.id.cSignInGoogle)
        signinGoogleButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

        val signinButton = findViewById<Button>(R.id.bSignIn)
        signinButton.setOnClickListener {
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent)
        }

        val signupButton = findViewById<TextView>(R.id.tSignUp)
        signupButton.setOnClickListener {
            val Intent = Intent(this,Sign_Up::class.java)
            startActivity(Intent)
        }
    }
}