package com.jera.apptemplate.presentation.graph.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/module/ActivityBindingModule;", "", "contributeLoginScreen", "Lcom/jera/apptemplate/presentation/view/user/signin/LogInActivity;", "contributeSignUpScreen", "Lcom/jera/apptemplate/presentation/view/user/signup/SignUpActivity;", "contributeSplashScreen", "Lcom/jera/apptemplate/presentation/view/splash/SplashActivity;", "presentation_debug"})
@dagger.Module()
public abstract interface ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.jera.apptemplate.presentation.graph.scope.ActivityScope()
    public abstract com.jera.apptemplate.presentation.view.splash.SplashActivity contributeSplashScreen();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.jera.apptemplate.presentation.graph.scope.ActivityScope()
    public abstract com.jera.apptemplate.presentation.view.user.signin.LogInActivity contributeLoginScreen();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.jera.apptemplate.presentation.graph.scope.ActivityScope()
    public abstract com.jera.apptemplate.presentation.view.user.signup.SignUpActivity contributeSignUpScreen();
}