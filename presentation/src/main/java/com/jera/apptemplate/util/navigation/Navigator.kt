package com.jera.apptemplate.util.navigation

import android.content.Context
import com.jera.apptemplate.presentation.view.main.MainActivity
import com.jera.apptemplate.util.extension.shouldClearTask

object Navigator {

    fun goTo(context: Context?, navData: NavData) {
        context?.let {
            val intent = when (navData) {
                is NavData.Login -> MainActivity.createIntent(it)
                //Add NavDatas here
                else -> throw RuntimeException("Don't know where should it go to. NavData ${navData.javaClass.simpleName}")
            }
            it.startActivity(intent)
        }
    }

    fun goToMain(context: Context, clearTask: Boolean = false) {
        context.startActivity(MainActivity.createIntent(context).apply { shouldClearTask(clearTask) })
    }
}