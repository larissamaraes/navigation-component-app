package com.jera.apptemplate.presentation.graph.module

import com.jera.apptemplate.presentation.graph.scope.ActivityScope
import com.jera.apptemplate.presentation.graph.scope.FragmentScope
import com.jera.apptemplate.presentation.view.main.MainActivity
import com.jera.apptemplate.presentation.view.main.balance.BalanceFragment
import com.jera.apptemplate.presentation.view.main.dashboard.MainFragment
import com.jera.apptemplate.presentation.view.main.payment.DisclaimerFragment
import com.jera.apptemplate.presentation.view.main.payment.PayPersonFragment
import com.jera.apptemplate.presentation.view.main.payment.PaymentCompleteFragment
import com.jera.apptemplate.presentation.view.main.people.PeopleFragment
import com.jera.apptemplate.presentation.view.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector
    fun contributeSplashScreen(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainScreen(): MainActivity

    @FragmentScope
    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun contributeBalanceFragment(): BalanceFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun contributePeopleFragment(): PeopleFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun contributeDisclaimerFragment(): DisclaimerFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun contributePaymentCompleteFragment(): PaymentCompleteFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun contributePayPersonFragment(): PayPersonFragment
}