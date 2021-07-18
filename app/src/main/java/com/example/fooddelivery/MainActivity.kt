package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAuthFragment()
    }

    private fun setupAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.rootScreen, AuthFragment())
            .commitNow()
    }
}