package com.jera.apptemplate.presentation.view.main.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.FragmentViewPeopleBinding
import com.jera.apptemplate.util.base.BaseFragment

class PeopleFragment : BaseFragment() {

    private lateinit var binding: FragmentViewPeopleBinding

    private val adapter = PeopleAdapter()

    private companion object {
        // Names generated by www.name-generator.org.uk
        private val PEOPLE_NAMES = listOf(
                "Kaelan Puckett",
                "Salim Bevan",
                "Alisha Lambert",
                "Leland Johnston",
                "Mared Logan",
                "Kit Summers",
                "Kyran Pearson",
                "Aaliya O'Sullivan",
                "Saffa Davies",
                "Muhammad Villalobos",
                "Angelica Crouch",
                "Collette Boyd",
                "Issac Oakley",
                "Alaina Solis",
                "Marianne Brookes",
                "Jon Rowe",
                "Aryaan Vasquez",
                "Virginia Devlin",
                "Minnie Wright",
                "Chandni Hale",
                "Jacque Snider",
                "Aniqa Potts",
                "Esmee Spence",
                "Kealan O'Moore",
                "Summer Lopez")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewPeopleBinding.inflate(inflater, container, false)
        setupUi()
        return binding.root
    }

    private fun setupUi() {
        with(adapter){
            setItems(PEOPLE_NAMES)
            setOnItemClickedListener {
                findNavController().navigate(R.id.action_peopleFragment_to_payPersonFragment)
            }
        }
        binding.peopleRecyclerView.adapter = adapter
    }
}