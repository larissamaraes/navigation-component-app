package com.jera.apptemplate.presentation.view.user.signin

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.jera.apptemplate.R
import com.jera.apptemplate.databinding.ActivityLoginBinding
import com.jera.apptemplate.util.base.BaseActivity
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.extension.*
import com.jera.apptemplate.util.navigation.Navigator
import com.jera.apptemplate.util.viewmodel.Placeholder
import observeChanges
import setError
import setOnClickListener
import javax.inject.Inject

class LogInActivity : BaseActivity() {

    override val baseViewModel: BaseViewModel get() = viewModel

    private lateinit var binding: ActivityLoginBinding

    @Inject
    protected lateinit var viewModel: LogInViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupUi()
    }

    override fun subscribeUi() {
        super.subscribeUi()
        viewModel.showEmailFieldError.observe(this, this::onNextEmailError)
        viewModel.showPasswordFieldError.observe(this, this::onNextPasswordError)
        viewModel.goToMain.observe(this, this::onNextGoToMain)
        viewModel.placeholder.observe(this, ::onNextPlaceholder)
    }

    private fun setupUi() {
        binding.emailInput.observeChanges(viewModel::onEmailChanged)
        binding.passwordInput.observeChanges(viewModel::onPasswordChanged)
        binding.facebookButton.setOnClickListener(viewModel::onFacebookButtonClicked)
        binding.googleButton.setOnClickListener(viewModel::onGoogleButtonClicked)
        binding.recoverPasswordButton.setOnClickListener(viewModel::onRecoverPasswordClicked)
        binding.registerButton.setOnClickListener(viewModel::onSignUpClicked)
        binding.submitButton.setOnClickListener(viewModel::onSubmitClicked)
    }

    private fun onNextGoToMain(shouldGo: Boolean?) {
        shouldGo?.let { Navigator.goToMain(this, true) }
    }

    private fun onNextPlaceholder(placeholder: Placeholder?) {
        placeholder?.let { binding.includedLoading?.placeholder = it }
    }

    private fun onNextEmailError(shouldShowError: Boolean?) {
        shouldShowError?.let {
            binding.emailInput.setError(it then R.string.error_invalid_email)
        }
    }

    private fun onNextPasswordError(shouldShowError: Boolean?) {
        shouldShowError?.let {
            binding.passwordInput.setError(it then R.string.error_invalid_password)

        }
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, LogInActivity::class.java)
                    .apply { shouldClearTask(true) }
        }
    }
}