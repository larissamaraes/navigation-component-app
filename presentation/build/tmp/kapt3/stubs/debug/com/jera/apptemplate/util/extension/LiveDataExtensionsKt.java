package com.jera.apptemplate.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0002\u00a2\u0006\u0002\u0010\u0004\u001aV\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u0007H\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u0007H\u0007\u0018\u00010\u00060\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u0002H\u00070\n\u001a4\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\f0\n\u001a:\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00110\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\f0\n\u001a:\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00110\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\f0\n\u001a4\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\f0\n\u00a8\u0006\u0014"}, d2 = {"defaultMutableLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "T", "t", "(Ljava/lang/Object;)Landroid/arch/lifecycle/MutableLiveData;", "map", "Landroid/arch/lifecycle/LiveData;", "U", "kotlin.jvm.PlatformType", "mapper", "Lkotlin/Function1;", "observe", "", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "observer", "observeEvent", "Lcom/jera/apptemplate/util/arch/Event;", "reObserveEvent", "reobserve", "presentation_debug"})
public final class LiveDataExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.arch.lifecycle.MutableLiveData<T> defaultMutableLiveData(@org.jetbrains.annotations.Nullable()
    T t) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<T> $receiver, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public static final <T extends java.lang.Object>void reobserve(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<T> $receiver, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public static final <T extends java.lang.Object>void reObserveEvent(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<T>> $receiver, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<com.jera.apptemplate.util.arch.Event<T>> $receiver, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public static final <T extends java.lang.Object, U extends java.lang.Object>android.arch.lifecycle.LiveData<U> map(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.LiveData<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends U> mapper) {
        return null;
    }
}