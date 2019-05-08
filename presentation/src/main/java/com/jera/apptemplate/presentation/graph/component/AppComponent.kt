package com.jera.apptemplate.presentation.graph.component

import android.content.Context
import com.jera.apptemplate.presentation.AppTemplateApplication
import com.jera.apptemplate.presentation.graph.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidInjectionModule::class,
            AndroidSupportInjectionModule::class,
            ApplicationBindingModule::class,
            ApplicationProviderModule::class,
            ApiProviderModule::class,
            ActivityBindingModule::class,
            MapperModule::class]
)
interface AppComponent {

    fun inject(appTemplateApplication: AppTemplateApplication): AppTemplateApplication

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}
