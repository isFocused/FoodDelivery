package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AuthFragment : Fragment() {

    private var nextButton: Button? = null
    private var editTextView: EditText? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton = view.findViewById(R.id.btStart)
        editTextView = view.findViewById(R.id.tvPhoneNumber)
        configureStartButton()
    }

    private fun configureStartButton() {
        nextButton?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(OrdersFragment.PHONE, editTextView?.text.toString())
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.rootScreen, OrdersFragment.getNewInstance(bundle))
                ?.addToBackStack(OrdersFragment.NAME_TAG)
                ?.commit()
        }
    }
}