package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class BasketOrdersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket_orders)
        val tvPhoneNumber = findViewById<TextView>(R.id.tvPhoneNumber)
        val btClose = findViewById<ImageButton>(R.id.btClose)
        tvPhoneNumber.text = "Телефон: ${intent.getStringExtra("phoneNumber")}"
        btClose.setOnClickListener {
            this.finish()
        }
    }
}