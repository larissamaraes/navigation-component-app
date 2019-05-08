package com.jera.apptemplate.util.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0 H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/jera/apptemplate/util/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "baseViewModel", "Lcom/jera/apptemplate/util/base/BaseViewModel;", "getBaseViewModel", "()Lcom/jera/apptemplate/util/base/BaseViewModel;", "dialog", "Landroid/app/Dialog;", "fragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onGoTo", "navData", "Lcom/jera/apptemplate/util/navigation/NavData;", "onNextDialog", "dialogData", "Lcom/jera/apptemplate/util/viewmodel/DialogData;", "onNextToast", "text", "", "subscribeUi", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "presentation_debug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> fragmentInjector;
    private android.app.Dialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getFragmentInjector() {
        return null;
    }
    
    protected final void setFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jera.apptemplate.util.base.BaseViewModel getBaseViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void subscribeUi() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    private final void onNextDialog(com.jera.apptemplate.util.viewmodel.DialogData dialogData) {
    }
    
    private final void onGoTo(com.jera.apptemplate.util.navigation.NavData navData) {
    }
    
    private final void onNextToast(java.lang.String text) {
    }
    
    public BaseActivity() {
        super();
    }
}