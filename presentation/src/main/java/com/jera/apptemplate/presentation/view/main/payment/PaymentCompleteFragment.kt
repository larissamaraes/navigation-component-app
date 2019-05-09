package com.jera.apptemplate.presentation.view.main.payment

import android.os.Bundle
import android.view.*
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.FragmentPaymentCompleteBinding
import com.jera.apptemplate.util.base.BaseFragment

class PaymentCompleteFragment : BaseFragment() {

    private lateinit var binding: FragmentPaymentCompleteBinding

    private val args: PaymentCompleteFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPaymentCompleteBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        setupUi()
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.payment_complete_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.done_button) {
            findNavController().navigate(R.id.action_paymentCompleteFragment_to_mainFragment)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupUi() {
        with(binding) {
            personName.text = args.personName
            fromAccountNumber.text = args.accountNumber
            amount.text = args.amount
        }
    }
}