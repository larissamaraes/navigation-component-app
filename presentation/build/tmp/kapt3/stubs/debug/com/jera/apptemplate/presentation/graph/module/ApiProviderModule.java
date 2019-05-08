package com.jera.apptemplate.presentation.graph.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\u001b\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00170\u0016H\u0007J*\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u001d\u001a\u00020\bH\u0007J\b\u0010\u001e\u001a\u00020\u001bH\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/module/ApiProviderModule;", "", "()V", "provideApiClient", "Lcom/jera/apptemplate/data/client/ApiClient;", "apiService", "Lcom/jera/apptemplate/data/client/ApiService;", "provideApiEndpoint", "", "provideApiService", "retrofit", "Lretrofit2/Retrofit;", "provideGson", "Lcom/google/gson/Gson;", "provideHttpLoggingInterceptor", "Lokhttp3/Interceptor;", "logLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "provideLogLevel", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptors", "", "Lkotlin/jvm/JvmSuppressWildcards;", "provideRetrofit", "okHttpClient", "rxJavaCallAdapterFactory", "Lcom/jakewharton/retrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "gson", "apiEndPoint", "provideRxJavaCallAdapter", "presentation_debug"})
@dagger.Module()
public final class ApiProviderModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoSet()
    @dagger.Provides()
    public final okhttp3.Interceptor provideHttpLoggingInterceptor(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor.Level logLevel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    java.util.Set<okhttp3.Interceptor> interceptors) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "ApiEndpoint")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideApiEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory provideRxJavaCallAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJavaCallAdapterFactory, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "ApiEndpoint")
    java.lang.String apiEndPoint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.jera.apptemplate.data.client.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.jera.apptemplate.data.client.ApiClient provideApiClient(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.client.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor.Level provideLogLevel() {
        return null;
    }
    
    public ApiProviderModule() {
        super();
    }
}