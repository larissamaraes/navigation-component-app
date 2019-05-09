package com.jera.apptemplate.presentation.view.splash

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.OnLifecycleEvent
import com.jera.apptemplate.util.base.BaseViewModel
import com.jera.apptemplate.util.extension.defaultMutableLiveData
import com.jera.apptemplate.util.extension.delayInSeconds
import javax.inject.Inject

class SplashViewModel @Inject constructor() : BaseViewModel() {

    val goToMain: LiveData<Boolean> get() = goToMainLiveData

    private val goToMainLiveData = defaultMutableLiveData(false)

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private fun onCreate() {
        { goToMainLiveData.postValue(true) }.delayInSeconds(DELAY_TIME_IN_SECONDS)
    }

    companion object {
        private const val DELAY_TIME_IN_SECONDS = 2L
    }
}