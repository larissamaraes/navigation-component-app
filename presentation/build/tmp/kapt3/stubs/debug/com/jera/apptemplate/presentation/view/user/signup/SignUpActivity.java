package com.jera.apptemplate.presentation.view.user.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\"\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020 H\u0014J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0017\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002\u00a2\u0006\u0002\u00100J\u0017\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u00010/H\u0002\u00a2\u0006\u0002\u00100J\u0012\u00103\u001a\u00020 2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020 H\u0002J\u0016\u00107\u001a\u00020 2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b09H\u0002J\b\u0010:\u001a\u00020 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006<"}, d2 = {"Lcom/jera/apptemplate/presentation/view/user/signup/SignUpActivity;", "Lcom/jera/apptemplate/util/base/BaseActivity;", "()V", "avatarDisposable", "Lio/reactivex/disposables/Disposable;", "baseViewModel", "Lcom/jera/apptemplate/util/base/BaseViewModel;", "getBaseViewModel", "()Lcom/jera/apptemplate/util/base/BaseViewModel;", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "schedulerProvider", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "getSchedulerProvider", "()Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "setSchedulerProvider", "(Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;)V", "viewModel", "Lcom/jera/apptemplate/presentation/view/user/signup/SignUpViewModel;", "getViewModel", "()Lcom/jera/apptemplate/presentation/view/user/signup/SignUpViewModel;", "setViewModel", "(Lcom/jera/apptemplate/presentation/view/user/signup/SignUpViewModel;)V", "getErrorMessageId", "", "field", "getTextInputLayout", "Landroid/support/design/widget/TextInputLayout;", "handleResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onActivityResult", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNextErrors", "errors", "Lcom/jera/apptemplate/domain/util/field/InvalidFieldsException;", "onNextGoToMain", "shouldGo", "", "(Ljava/lang/Boolean;)V", "onNextPermission", "shouldRequest", "onNextPlaceholder", "placeholder", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "setupUi", "showFieldError", "fields", "", "subscribeUi", "Companion", "presentation_debug"})
public final class SignUpActivity extends com.jera.apptemplate.util.base.BaseActivity {
    private error.NonExistentClass binding;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.jera.apptemplate.presentation.view.user.signup.SignUpViewModel viewModel;
    private io.reactivex.disposables.Disposable avatarDisposable;
    private static final java.lang.String CPF_MASK = "###.###.###-##";
    private static final java.lang.String PHONE_MASK_9_DIGITS = "(##) #####-####";
    private static final int FIELD_NAME = 1;
    private static final int FIELD_EMAIL = 2;
    private static final int FIELD_PHONE_NUMBER = 3;
    private static final int FIELD_CPF = 4;
    private static final int FIELD_PASSWORD = 5;
    private static final int FIELD_PASSWORD_CONFIRMATION = 6;
    public static final com.jera.apptemplate.presentation.view.user.signup.SignUpActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jera.apptemplate.util.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jera.apptemplate.domain.util.provider.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    protected final void setSchedulerProvider(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jera.apptemplate.presentation.view.user.signup.SignUpViewModel getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.presentation.view.user.signup.SignUpViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setupUi() {
    }
    
    @java.lang.Override()
    public void subscribeUi() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleResult(int requestCode, int resultCode, android.content.Intent data) {
    }
    
    private final void onNextPlaceholder(com.jera.apptemplate.util.viewmodel.Placeholder placeholder) {
    }
    
    private final void onNextPermission(java.lang.Boolean shouldRequest) {
    }
    
    private final void onNextGoToMain(java.lang.Boolean shouldGo) {
    }
    
    private final void onNextErrors(com.jera.apptemplate.domain.util.field.InvalidFieldsException errors) {
    }
    
    private final void showFieldError(java.util.List<java.lang.Integer> fields) {
    }
    
    private final android.support.design.widget.TextInputLayout getTextInputLayout(int field) {
        return null;
    }
    
    private final int getErrorMessageId(int field) {
        return 0;
    }
    
    public SignUpActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/jera/apptemplate/presentation/view/user/signup/SignUpActivity$Companion;", "", "()V", "CPF_MASK", "", "FIELD_CPF", "", "FIELD_EMAIL", "FIELD_NAME", "FIELD_PASSWORD", "FIELD_PASSWORD_CONFIRMATION", "FIELD_PHONE_NUMBER", "PHONE_MASK_9_DIGITS", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "presentation_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}