package com.example.fooddelivery

interface Navigation {
   fun setupAuthFragment()
   fun setupOrdersFragment(phoneNumber: String)
   fun openMenuDialog()
}