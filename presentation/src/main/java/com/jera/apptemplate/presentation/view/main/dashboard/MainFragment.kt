package com.jera.apptemplate.presentation.view.main.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentMainBinding
import com.jera.apptemplate.util.base.BaseFragment

class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
}