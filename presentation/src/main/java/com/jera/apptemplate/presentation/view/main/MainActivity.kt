package com.jera.apptemplate.presentation.view.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.ActivityMainBinding
import com.jera.apptemplate.util.base.BaseActivity
import com.jera.apptemplate.util.base.BaseViewModel
import javax.inject.Inject

class MainActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityMainBinding

    @Inject
    protected lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        NavigationUI.setupActionBarWithNavController(this, findNavController(R.id.nav_host_fragment))
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp()
    }
}