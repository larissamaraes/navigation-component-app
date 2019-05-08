package com.jera.apptemplate.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u001e\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b\u001a0\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b\u001a0\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b\u001a\u0012\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\u000e\u001a\u00020\u000f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00102\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0011"}, d2 = {"defaultConsumers", "Lio/reactivex/Completable;", "onSubscribeCallback", "Lkotlin/Function0;", "", "doAfterTerminatecallback", "Lio/reactivex/Observable;", "T", "Lio/reactivex/Single;", "defaultPlaceholders", "placeholderPlacerAction", "Lkotlin/Function1;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "defaultSched", "schedulerProvider", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "Lio/reactivex/subjects/PublishSubject;", "presentation_debug"})
public final class RxExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Single<T> defaultSched(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Single<T> defaultConsumers(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSubscribeCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> doAfterTerminatecallback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Single<T> defaultPlaceholders(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jera.apptemplate.util.viewmodel.Placeholder, kotlin.Unit> placeholderPlacerAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> defaultConsumers(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSubscribeCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> doAfterTerminatecallback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> defaultSched(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $receiver, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> defaultPlaceholders(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jera.apptemplate.util.viewmodel.Placeholder, kotlin.Unit> placeholderPlacerAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> defaultSched(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<T> $receiver, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Completable defaultSched(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $receiver, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.provider.SchedulerProvider schedulerProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Completable defaultPlaceholders(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.jera.apptemplate.util.viewmodel.Placeholder, kotlin.Unit> placeholderPlacerAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Completable defaultConsumers(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSubscribeCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> doAfterTerminatecallback) {
        return null;
    }
}