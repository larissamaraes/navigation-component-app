package com.jera.apptemplate.presentation.view.main.balance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentViewBalancesBinding
import com.jera.apptemplate.util.base.BaseFragment

class BalanceFragment : BaseFragment() {

    private lateinit var binding: FragmentViewBalancesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewBalancesBinding.inflate(inflater, container, false)
        return binding.root
    }
}