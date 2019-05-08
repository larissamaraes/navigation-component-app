package com.jera.apptemplate.util.navigation

import android.content.Context
import com.jera.apptemplate.presentation.view.user.signin.LogInActivity
import com.jera.apptemplate.presentation.view.user.signup.SignUpActivity
import com.jera.apptemplate.presentation.view.user.signup.SignUpActivity_MembersInjector
import com.jera.apptemplate.util.extension.shouldClearTask

object Navigator {

    fun goTo(context: Context?, navData: NavData) {
        context?.let {
            val intent = when (navData) {
                is NavData.Login -> LogInActivity.createIntent(it)
                is NavData.SignUp -> SignUpActivity.createIntent(it)
                else -> throw RuntimeException("Don't know where should it go to. NavData ${navData.javaClass.simpleName}")
            }
            it.startActivity(intent)
        }
    }

    fun goToMain(context: Context, clearTask: Boolean = false) {
//        context.startActivity(MainActivity.createIntent(context).apply { shouldClearTask(clearTask) })
    }

    fun goToLogin(context: Context, clearTask: Boolean = false) {
        context.startActivity(LogInActivity.createIntent(context).apply{ shouldClearTask(clearTask) })
    }
}