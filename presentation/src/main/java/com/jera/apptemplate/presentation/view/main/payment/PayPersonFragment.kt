package com.jera.apptemplate.presentation.view.main.payment

import android.os.Bundle
import android.view.*
import androidx.navigation.fragment.findNavController
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.FragmentPayPersonBinding
import com.jera.apptemplate.util.base.BaseFragment

class PayPersonFragment : BaseFragment() {

    private lateinit var binding: FragmentPayPersonBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPayPersonBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        setupUi()
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.pay_person_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.next_button) {
            findNavController().navigate(R.id.action_payPersonFragment_to_paymentCompleteFragment)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupUi() {
        binding.disclaimerButton.setOnClickListener {
            findNavController().navigate(R.id.action_payPersonFragment_to_disclaimerFragment)
        }
    }
}