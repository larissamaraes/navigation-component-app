package com.jera.apptemplate.presentation.graph.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/module/ApplicationProviderModule;", "", "()V", "provideLoginAction", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "cache", "Lcom/jera/apptemplate/domain/util/storage/Cache;", "presentation_debug"})
@dagger.Module(includes = {com.jera.apptemplate.presentation.graph.module.MapperModule.class})
public final class ApplicationProviderModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "NAME_LOGIN_ACTION")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> provideLoginAction(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.storage.Cache cache) {
        return null;
    }
    
    public ApplicationProviderModule() {
        super();
    }
}