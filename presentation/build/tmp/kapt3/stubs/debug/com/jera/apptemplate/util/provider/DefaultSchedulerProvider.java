package com.jera.apptemplate.util.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/jera/apptemplate/util/provider/DefaultSchedulerProvider;", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "main", "presentation_debug"})
public final class DefaultSchedulerProvider implements com.jera.apptemplate.domain.util.provider.SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler main() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler computation() {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultSchedulerProvider() {
        super();
    }
}