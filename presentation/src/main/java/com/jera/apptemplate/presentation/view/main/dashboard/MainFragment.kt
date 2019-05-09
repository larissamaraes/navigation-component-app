package com.jera.apptemplate.presentation.view.main.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.FragmentMainBinding
import com.jera.apptemplate.util.base.BaseFragment
import setOnClickListener

class MainFragment : BaseFragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        with(binding) {
            viewBalancesButton.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_balanceFragment)
            }
            paySomeoneButton.setOnClickListener {
                findNavController().navigate(R.id.action_peopleFragment_to_payPersonFragment)
            }
        }
    }
}