package com.example.fooddelivery.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddelivery.Navigation
import com.example.fooddelivery.databinding.FragmentOrdersBinding

class OrdersFragment : Fragment() {

    companion object {
        const val NAME_TAG = "OrdersFragment"
        const val PHONE = "Phone"

        fun getNewInstance(phoneNumber: String) : OrdersFragment {
            return OrdersFragment().apply {
                PHONE to phoneNumber
            }
        }
    }

    private lateinit var binding: FragmentOrdersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrdersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureView()
    }

    private fun configureView() {
        binding.tvPhoneNumber.text = arguments?.getString(PHONE) ?: "Null"
        binding.btClose.setOnClickListener {
            activity?.onBackPressed()
        }
        binding.clAll.setOnClickListener {
            (activity as? Navigation)?.openMenuDialog()
        }
    }
}