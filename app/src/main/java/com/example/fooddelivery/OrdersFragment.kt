package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddelivery.databinding.FragmentOrdersBinding

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
    }
}