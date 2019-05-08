package com.jera.apptemplate.presentation.view.splash

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.OnLifecycleEvent
import com.jera.apptemplate.domain.interactors.user.GetPersistedUser
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.extension.defaultMutableLiveData
import javax.inject.Inject

class SplashViewModel @Inject constructor(private val getPersistedUser: GetPersistedUser) : BaseViewModel() {

    val goToMain: LiveData<Boolean> get() = goToMainLiveData
    val goToLogin: LiveData<Boolean> get() = goToLoginLiveData

    private val goToMainLiveData = defaultMutableLiveData(false)
    private val goToLoginLiveData = defaultMutableLiveData(false)

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun checkUser() {
        if (getPersistedUser.execute() == null) {
            goToLoginLiveData.postValue(true)
        } else {
            goToMainLiveData.postValue(true)
        }
    }
}