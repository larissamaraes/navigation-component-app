package com.jera.apptemplate.presentation.view.user.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001cJ\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u001cJ\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u001cJ\u000e\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u001cJ\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u001cJ\u0006\u0010.\u001a\u00020\u0019J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020!H\u0002JB\u00100\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0002R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/jera/apptemplate/presentation/view/user/signup/SignUpViewModel;", "Lcom/jera/apptemplate/util/base/BaseViewModel;", "signUp", "Lcom/jera/apptemplate/domain/interactors/user/SignUp;", "schedulerProvider", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "(Lcom/jera/apptemplate/domain/interactors/user/SignUp;Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;)V", "errors", "Landroid/arch/lifecycle/LiveData;", "Lcom/jera/apptemplate/util/arch/Event;", "Lcom/jera/apptemplate/domain/util/field/InvalidFieldsException;", "getErrors", "()Landroid/arch/lifecycle/LiveData;", "errorsLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "form", "Lcom/jera/apptemplate/util/forms/SignUpForm;", "goToMain", "", "getGoToMain", "goToMainLiveData", "requestPermission", "getRequestPermission", "requestPermissionLiveData", "onAvatarClicked", "", "onCpfChanged", "cpf", "", "onEmailChanged", "email", "onFailure", "throwable", "", "onImagePickerFailure", "onImagePickerSuccess", "file", "Ljava/io/File;", "onNameChanged", "name", "onPasswordChanged", "password", "onPasswordConfirmationChanged", "passwordConfirmation", "onPhoneChanged", "phone", "onSubmitClicked", "showFieldErrors", "submit", "confirmationPassword", "avatarPath", "presentation_debug"})
public final class SignUpViewModel extends com.jera.apptemplate.util.base.BaseViewModel {
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.domain.util.field.InvalidFieldsException>> errorsLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> goToMainLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.arch.Event<java.lang.Boolean>> requestPermissionLiveData = null;
    private final com.jera.apptemplate.util.forms.SignUpForm form = null;
    private final com.jera.apptemplate.domain.interactors.user.SignUp signUp = null;
    private final com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.domain.util.field.InvalidFieldsException>> getErrors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> getGoToMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<java.lang.Boolean>> getRequestPermission() {
        return null;
    }
    
    public final void onNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void onCpfChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
    }
    
    public final void onPhoneChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    public final void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void onPasswordConfirmationChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String passwordConfirmation) {
    }
    
    public final void onSubmitClicked() {
    }
    
    public final void onAvatarClicked() {
    }
    
    private final void submit(java.lang.String email, java.lang.String password, java.lang.String name, java.lang.String cpf, java.lang.String phone, java.lang.String confirmationPassword, java.lang.String avatarPath) {
    }
    
    public final void onImagePickerSuccess(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final void onImagePickerFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    private final void showFieldErrors(java.lang.Throwable errors) {
    }
    
    private final void onFailure(java.lang.Throwable throwable) {
    }
    
    @javax.inject.Inject()
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.interactors.user.SignUp signUp, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        super();
    }
}