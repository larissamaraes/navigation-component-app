package com.jera.apptemplate.presentation.view.splash

import com.jera.apptemplate.util.base.BaseActivity
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.extension.observe
import com.jera.apptemplate.util.navigation.Navigator
import javax.inject.Inject

class SplashActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    @Inject
    protected lateinit var viewModel: SplashViewModel

    override fun subscribeUi() {
        super.subscribeUi()
        viewModel.goToMain.observe(this, ::onNextGoToMainValue)
    }

    private fun onNextGoToMainValue(shouldGo: Boolean?) {
        shouldGo?.let { if (it) Navigator.goToMain(this, true) }
    }
}
