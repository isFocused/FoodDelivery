package com.example.fooddelivery

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView

class OrdersFragment : Fragment() {

    companion object {
        val NAME_TAG = String::class.toString()
        const val PHONE = "Phone"

        fun getNewInstance(bundle: Bundle?) : OrdersFragment {
            val fragment = OrdersFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    var tvPhoneNumber: TextView? = null
    var btClose: ImageButton? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvPhoneNumber = view.findViewById(R.id.tvPhoneNumber)
        btClose = view.findViewById(R.id.btClose)
        configureView()
    }

    private fun configureView() {
        tvPhoneNumber?.text = arguments?.getString(PHONE) ?: "Null"
        btClose?.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}