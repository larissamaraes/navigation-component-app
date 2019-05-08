package com.jera.apptemplate.presentation.view.splash

import android.os.Bundle
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
        viewModel.goToLogin.observe(this, ::onNextGoToLoginValue)
    }

    private fun onNextGoToMainValue(shouldGo: Boolean?) {
        shouldGo?.let { if (it) Navigator.goToMain(this, true) }
    }

    private fun onNextGoToLoginValue(shouldGo: Boolean?) {
        shouldGo?.let { if (it) Navigator.goToLogin(this, true) }
    }

}
