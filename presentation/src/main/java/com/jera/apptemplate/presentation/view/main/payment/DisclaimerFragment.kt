package com.jera.apptemplate.presentation.view.main.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentViewDisclaimerBinding
import com.jera.apptemplate.util.base.BaseFragment

class DisclaimerFragment : BaseFragment() {

    private lateinit var binding: FragmentViewDisclaimerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewDisclaimerBinding.inflate(inflater, container, false)
        return binding.root
    }
}