package com.jera.apptemplate.util.base

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.support.annotation.CallSuper
import com.jera.apptemplate.util.arch.Event
import com.jera.apptemplate.util.error.ErrorHandler
import com.jera.apptemplate.util.navigation.NavData
import com.jera.apptemplate.util.viewmodel.DialogData
import com.jera.apptemplate.util.viewmodel.Placeholder
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class
BaseViewModel : ViewModel(), LifecycleObserver {

    @Inject
    protected lateinit var errorHandler: ErrorHandler

    val disposables = CompositeDisposable()

    val placeholder: LiveData<Placeholder> get() = placeholderLiveData
    val goTo: LiveData<Event<NavData>> get() = goToLiveData
    val dialog: LiveData<Event<DialogData>> get() = dialogLiveData
    val toast: LiveData<Event<String>> get() = toastLiveData

    private val placeholderLiveData = MutableLiveData<Placeholder>()
    private val goToLiveData = MutableLiveData<Event<NavData>>()
    private val dialogLiveData = MutableLiveData<Event<DialogData>>()
    private val toastLiveData = MutableLiveData<Event<String>>()

    fun setPlaceholder(placeholder: Placeholder) {
        placeholderLiveData.postValue(placeholder)
    }

    fun setPlaceholder(throwable: Throwable, retryAction: (() -> Unit)? = null) {
        setPlaceholder(errorHandler.getPlaceholder(throwable, retryAction))
    }

    fun setDialog(dialogData: DialogData) {
        dialogLiveData.postValue(Event(dialogData))
    }

    fun setDialog(
            throwable: Throwable,
            retryAction: (() -> Unit)? = null,
            onDismiss: (() -> Unit)? = null
    ) {
        setDialog(errorHandler.getDialogData(throwable, retryAction, onDismiss))
    }

    fun goTo(navData: NavData) {
        goToLiveData.postValue(Event(navData))
    }

    @CallSuper
    override fun onCleared() {
        disposables.clear()
    }

}