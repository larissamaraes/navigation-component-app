package com.jera.apptemplate.presentation.graph.module

import com.jera.apptemplate.presentation.graph.scope.ActivityScope
import com.jera.apptemplate.presentation.view.splash.SplashActivity
import com.jera.apptemplate.presentation.view.user.signin.LogInActivity
import com.jera.apptemplate.presentation.view.user.signup.SignUpActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule{
    @ActivityScope
    @ContributesAndroidInjector
    fun contributeSplashScreen(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeLoginScreen(): LogInActivity

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeSignUpScreen(): SignUpActivity
}