package com.jera.apptemplate.presentation.view.main.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentPayPersonBinding
import com.jera.apptemplate.util.base.BaseFragment

class PayPersonFragment : BaseFragment() {

    private lateinit var binding: FragmentPayPersonBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPayPersonBinding.inflate(inflater, container, false)
        return binding.root
    }
}