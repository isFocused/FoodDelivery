package com.example.fooddelivery.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.fooddelivery.R

class Stepper : LinearLayout {

    var value = 1
    var btnNegative: Button? = null
    var btnPositive: Button? = null
    var tvValue: TextView? = null

    constructor(context: Context) : super(context) {
        initView()
    }

    constructor(context: Context, attr: AttributeSet? = null) : super(context, attr) {
        initView()
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        initView()
    }

    private fun initView() {
        val rootView = (context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.stepper, this, true)
        btnNegative = rootView.findViewById(R.id.btnNegative)
        btnPositive = rootView.findViewById(R.id.btnPositive)
        tvValue = rootView.findViewById(R.id.tvValue)
        tvValue?.text = "$value"
        configureAction()
    }

    private fun configureAction() {
        btnNegative?.setOnClickListener {
            if (value != 1) value -= 1
            tvValue?.text = "$value"
        }
        btnPositive?.setOnClickListener {
            if (value != 10) value += 1
            tvValue?.text = "$value"
        }
    }
}