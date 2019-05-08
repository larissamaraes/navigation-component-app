package com.jera.apptemplate.presentation.view.user.signin

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.jera.apptemplate.domain.interactors.user.LogIn
import com.jera.apptemplate.util.extension.defaultPlaceholders
import com.jera.apptemplate.util.extension.defaultSched
import com.jera.apptemplate.domain.util.field.InvalidFieldsException
import com.jera.apptemplate.domain.util.provider.SchedulerProvider
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.forms.LoginForm
import com.jera.apptemplate.util.navigation.NavData
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class LogInViewModel @Inject constructor(
        private val logIn: LogIn,
        private val schedulerProvider: SchedulerProvider
) : BaseViewModel() {

    val showEmailFieldError: LiveData<Boolean> get() = showEmailFieldErrorLiveData
    val showPasswordFieldError: LiveData<Boolean> get() = showPasswordFieldErrorLiveData
    val goToMain: LiveData<Boolean> get() = goToMainLiveData

    private val showEmailFieldErrorLiveData: MutableLiveData<Boolean> = MutableLiveData()
    private val showPasswordFieldErrorLiveData: MutableLiveData<Boolean> = MutableLiveData()
    private val goToMainLiveData: MutableLiveData<Boolean> = MutableLiveData()

    private var form = LoginForm()
    private var signInDisposable: Disposable? = null


    fun onEmailChanged(email: String) {
        form.email = email
    }

    fun onPasswordChanged(password: String) {
        form.password = password
    }

    fun onFacebookButtonClicked() {}

    fun onGoogleButtonClicked() {}

    fun onRecoverPasswordClicked() {}

    fun onSignUpClicked() {
        goTo(NavData.SignUp)
    }

    fun onSubmitClicked() {
        form.useForm(this::submit)?.let { showFieldErrors(it) }
    }

    private fun submit(email: String, password: String) {
        signInDisposable?.dispose()
        signInDisposable = logIn.execute(email, password, null)
                .defaultPlaceholders(::setPlaceholder)
                .defaultSched(schedulerProvider)
                .subscribeBy(this::onFailure) {
                    showEmailFieldErrorLiveData.value = false
                    showPasswordFieldErrorLiveData.value = false
                    goToMainLiveData.value = true
                }
    }

    private fun onFailure(throwable: Throwable) {
        if (throwable is InvalidFieldsException) {
            showFieldErrors(throwable)
        } else {
            setDialog(throwable, this::onSubmitClicked)
        }
    }

    private fun showFieldErrors(e: InvalidFieldsException) {
        for (field in e.getFields()) {
            showFieldError(field)
        }
    }

    private fun showFieldError(field: Int) {
        when (field) {
            InvalidFieldsException.EMAIL -> showEmailFieldErrorLiveData.value = true
            InvalidFieldsException.PASSWORD -> showPasswordFieldErrorLiveData.value = true
        }
    }


}