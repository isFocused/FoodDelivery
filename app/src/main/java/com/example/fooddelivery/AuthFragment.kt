package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddelivery.databinding.FragmentAuthBinding

class AuthFragment : Fragment() {

    private lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureStartButton()
    }

    private fun configureStartButton() {
        binding.btBegin.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(OrdersFragment.PHONE, binding.tvPhoneNumber.text.toString())
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.rootScreen, OrdersFragment.getNewInstance(bundle))
                ?.addToBackStack(OrdersFragment.NAME_TAG)
                ?.commit()
        }
    }
}