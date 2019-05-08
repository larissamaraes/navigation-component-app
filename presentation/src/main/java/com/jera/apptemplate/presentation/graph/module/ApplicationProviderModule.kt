package com.jera.apptemplate.presentation.graph.module

import android.content.Context
import com.jera.apptemplate.domain.util.storage.Cache
import com.jera.apptemplate.presentation.view.user.signin.LogInActivity
import com.jera.apptemplate.util.resource.NAME_LOGIN_ACTION
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = arrayOf(MapperModule::class))
class ApplicationProviderModule {
    @Provides
    @Named(NAME_LOGIN_ACTION)
    fun provideLoginAction(context: Context, cache: Cache): () -> Unit {
        return {
            cache.clear()
            context.startActivity(LogInActivity.createIntent(context))
        }
    }
}