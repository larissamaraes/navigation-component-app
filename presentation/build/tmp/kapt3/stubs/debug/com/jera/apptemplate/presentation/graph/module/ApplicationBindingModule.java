package com.jera.apptemplate.presentation.graph.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/module/ApplicationBindingModule;", "", "()V", "bindAuthInterceptor", "Lokhttp3/Interceptor;", "interceptor", "Lcom/jera/apptemplate/data/util/request/interceptor/AuthInterceptor;", "bindCache", "Lcom/jera/apptemplate/domain/util/storage/Cache;", "cache", "Lcom/jera/apptemplate/data/util/storage/PreferencesCache;", "bindLogger", "Lcom/jera/apptemplate/domain/util/logger/Logger;", "logger", "Lcom/jera/apptemplate/util/logger/AndroidLogger;", "bindSchedulerProvider", "Lcom/jera/apptemplate/domain/util/provider/SchedulerProvider;", "schedulerProvider", "Lcom/jera/apptemplate/util/provider/DefaultSchedulerProvider;", "bindStrings", "Lcom/jera/apptemplate/domain/util/resource/Strings;", "androidStrings", "Lcom/jera/apptemplate/util/resource/AndroidStrings;", "bindUserRepository", "Lcom/jera/apptemplate/domain/boundary/UserRepository;", "repository", "Lcom/jera/apptemplate/data/repository/DefaultUserRepository;", "presentation_debug"})
@dagger.Module(includes = {com.jera.apptemplate.presentation.graph.module.MapperModule.class})
public abstract class ApplicationBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.domain.util.storage.Cache bindCache(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.util.storage.PreferencesCache cache);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.domain.util.provider.SchedulerProvider bindSchedulerProvider(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.provider.DefaultSchedulerProvider schedulerProvider);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.domain.util.resource.Strings bindStrings(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.resource.AndroidStrings androidStrings);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.domain.util.logger.Logger bindLogger(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.logger.AndroidLogger logger);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.domain.boundary.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.repository.DefaultUserRepository repository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoSet()
    @dagger.Binds()
    public abstract okhttp3.Interceptor bindAuthInterceptor(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.util.request.interceptor.AuthInterceptor interceptor);
    
    public ApplicationBindingModule() {
        super();
    }
}