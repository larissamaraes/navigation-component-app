package com.jera.apptemplate.presentation.view.user.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010 \u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0019J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/jera/apptemplate/presentation/view/user/signin/LogInViewModel;", "Lcom/jera/apptemplate/util/base/BaseViewModel;", "logIn", "Lcom/jera/apptemplate/domain/interactors/user/LogIn;", "schedulerProvider", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "(Lcom/jera/apptemplate/domain/interactors/user/LogIn;Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;)V", "form", "Lcom/jera/apptemplate/util/forms/LoginForm;", "goToMain", "Landroid/arch/lifecycle/LiveData;", "", "getGoToMain", "()Landroid/arch/lifecycle/LiveData;", "goToMainLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "showEmailFieldError", "getShowEmailFieldError", "showEmailFieldErrorLiveData", "showPasswordFieldError", "getShowPasswordFieldError", "showPasswordFieldErrorLiveData", "signInDisposable", "Lio/reactivex/disposables/Disposable;", "onEmailChanged", "", "email", "", "onFacebookButtonClicked", "onFailure", "throwable", "", "onGoogleButtonClicked", "onPasswordChanged", "password", "onRecoverPasswordClicked", "onSignUpClicked", "onSubmitClicked", "showFieldError", "field", "", "showFieldErrors", "e", "Lcom/jera/apptemplate/domain/util/field/InvalidFieldsException;", "submit", "presentation_debug"})
public final class LogInViewModel extends com.jera.apptemplate.util.base.BaseViewModel {
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showEmailFieldErrorLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showPasswordFieldErrorLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> goToMainLiveData = null;
    private com.jera.apptemplate.util.forms.LoginForm form;
    private io.reactivex.disposables.Disposable signInDisposable;
    private final com.jera.apptemplate.domain.interactors.user.LogIn logIn = null;
    private final com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getShowEmailFieldError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getShowPasswordFieldError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getGoToMain() {
        return null;
    }
    
    public final void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void onFacebookButtonClicked() {
    }
    
    public final void onGoogleButtonClicked() {
    }
    
    public final void onRecoverPasswordClicked() {
    }
    
    public final void onSignUpClicked() {
    }
    
    public final void onSubmitClicked() {
    }
    
    private final void submit(java.lang.String email, java.lang.String password) {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    private final void showFieldErrors(com.jera.apptemplate.domain.util.field.InvalidFieldsException e) {
    }
    
    private final void showFieldError(int field) {
    }
    
    @javax.inject.Inject()
    public LogInViewModel(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.interactors.user.LogIn logIn, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        super();
    }
}