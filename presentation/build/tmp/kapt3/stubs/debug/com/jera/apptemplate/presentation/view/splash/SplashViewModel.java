package com.jera.apptemplate.presentation.view.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/jera/apptemplate/presentation/view/splash/SplashViewModel;", "Lcom/jera/apptemplate/util/base/BaseViewModel;", "getPersistedUser", "Lcom/jera/apptemplate/domain/interactors/user/GetPersistedUser;", "(Lcom/jera/apptemplate/domain/interactors/user/GetPersistedUser;)V", "goToLogin", "Landroid/arch/lifecycle/LiveData;", "", "getGoToLogin", "()Landroid/arch/lifecycle/LiveData;", "goToLoginLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "goToMain", "getGoToMain", "goToMainLiveData", "checkUser", "", "presentation_debug"})
public final class SplashViewModel extends com.jera.apptemplate.util.base.BaseViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> goToMainLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> goToLoginLiveData = null;
    private final com.jera.apptemplate.domain.interactors.user.GetPersistedUser getPersistedUser = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getGoToMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getGoToLogin() {
        return null;
    }
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_CREATE)
    private final void checkUser() {
    }
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.interactors.user.GetPersistedUser getPersistedUser) {
        super();
    }
}