package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.fooddelivery.fragments.AuthFragment
import com.example.fooddelivery.fragments.MenuDetailDialogFragment
import com.example.fooddelivery.fragments.OrdersFragment

class MainActivity : FragmentActivity(), Navigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAuthFragment()
    }

    override fun setupAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.rootScreen, AuthFragment())
            .commit()
    }

    override fun setupOrdersFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.rootScreen, OrdersFragment.getNewInstance(phoneNumber))
            .addToBackStack(OrdersFragment.NAME_TAG)
            .commit()
    }

    override fun openMenuDialog() {
        MenuDetailDialogFragment()
            .show(supportFragmentManager, MenuDetailDialogFragment.NAME_TAG)
    }
}