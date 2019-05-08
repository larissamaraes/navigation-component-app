package com.jera.apptemplate.util.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017J\b\u0010$\u001a\u00020\"H\u0015J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0007J2\u0010%\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*J\u000e\u0010,\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010,\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010*R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\tR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b \u0010\tR\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/jera/apptemplate/util/base/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Landroid/arch/lifecycle/LifecycleObserver;", "()V", "dialog", "Landroid/arch/lifecycle/LiveData;", "Lcom/jera/apptemplate/util/arch/Event;", "Lcom/jera/apptemplate/util/viewmodel/DialogData;", "getDialog", "()Landroid/arch/lifecycle/LiveData;", "dialogLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "errorHandler", "Lcom/jera/apptemplate/util/error/ErrorHandler;", "getErrorHandler", "()Lcom/jera/apptemplate/util/error/ErrorHandler;", "setErrorHandler", "(Lcom/jera/apptemplate/util/error/ErrorHandler;)V", "goTo", "Lcom/jera/apptemplate/util/navigation/NavData;", "getGoTo", "goToLiveData", "placeholder", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "getPlaceholder", "placeholderLiveData", "toast", "", "getToast", "toastLiveData", "", "navData", "onCleared", "setDialog", "dialogData", "throwable", "", "retryAction", "Lkotlin/Function0;", "onDismiss", "setPlaceholder", "presentation_debug"})
public abstract class BaseViewModel extends android.arch.lifecycle.ViewModel implements android.arch.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected com.jera.apptemplate.util.error.ErrorHandler errorHandler;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.viewmodel.Placeholder> placeholderLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.util.navigation.NavData>> goToLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.util.viewmodel.DialogData>> dialogLiveData = null;
    private final android.arch.lifecycle.MutableLiveData<com.jera.apptemplate.util.arch.Event<java.lang.String>> toastLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jera.apptemplate.util.error.ErrorHandler getErrorHandler() {
        return null;
    }
    
    protected final void setErrorHandler(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.error.ErrorHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.viewmodel.Placeholder> getPlaceholder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.util.navigation.NavData>> getGoTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<com.jera.apptemplate.util.viewmodel.DialogData>> getDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<java.lang.String>> getToast() {
        return null;
    }
    
    public final void setPlaceholder(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.viewmodel.Placeholder placeholder) {
    }
    
    public final void setPlaceholder(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryAction) {
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.viewmodel.DialogData dialogData) {
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryAction, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    public final void goTo(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.navigation.NavData navData) {
    }
    
    @android.support.annotation.CallSuper()
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}