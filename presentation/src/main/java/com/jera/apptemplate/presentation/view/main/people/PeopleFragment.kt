package com.jera.apptemplate.presentation.view.main.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jera.apptemplate.databinding.FragmentViewPeopleBinding
import com.jera.apptemplate.util.base.BaseFragment

class PeopleFragment : BaseFragment() {

    private lateinit var binding: FragmentViewPeopleBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewPeopleBinding.inflate(inflater, container, false)
        return binding.root
    }
}