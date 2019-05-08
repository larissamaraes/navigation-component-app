package com.jera.apptemplate.presentation.graph.module

import com.jera.apptemplate.data.repository.DefaultUserRepository
import com.jera.apptemplate.data.util.request.interceptor.AuthInterceptor
import com.jera.apptemplate.data.util.storage.PreferencesCache
import com.jera.apptemplate.domain.boundary.UserRepository
import com.jera.apptemplate.domain.util.logger.Logger
import com.jera.apptemplate.domain.util.provider.SchedulerProvider
import com.jera.apptemplate.domain.util.resource.Strings
import com.jera.apptemplate.domain.util.storage.Cache
import com.jera.apptemplate.util.logger.AndroidLogger
import com.jera.apptemplate.util.provider.DefaultSchedulerProvider
import com.jera.apptemplate.util.resource.AndroidStrings
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import okhttp3.Interceptor

@Module(includes = arrayOf(MapperModule::class))
abstract class ApplicationBindingModule {
    @Binds
    abstract fun bindCache(cache: PreferencesCache): Cache

    @Binds
    abstract fun bindSchedulerProvider(schedulerProvider: DefaultSchedulerProvider): SchedulerProvider

    @Binds
    abstract fun bindStrings(androidStrings: AndroidStrings): Strings

    @Binds
    abstract fun bindLogger(logger: AndroidLogger): Logger

    @Binds
    abstract fun bindUserRepository(repository: DefaultUserRepository): UserRepository

    @Binds
    @IntoSet
    abstract fun bindAuthInterceptor(interceptor: AuthInterceptor): Interceptor


}