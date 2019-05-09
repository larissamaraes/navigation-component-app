package com.jera.apptemplate.presentation.view.main.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentPaymentCompleteBinding
import com.jera.apptemplate.util.base.BaseFragment

class PaymentCompleteFragment : BaseFragment() {

    private lateinit var binding: FragmentPaymentCompleteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPaymentCompleteBinding.inflate(inflater, container, false)
        return binding.root
    }
}