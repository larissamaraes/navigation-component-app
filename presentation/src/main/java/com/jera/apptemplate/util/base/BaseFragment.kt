package com.jera.apptemplate.util.base

import android.app.Dialog
import android.content.Context
import com.jera.apptemplate.util.extension.showDialog
import com.jera.apptemplate.util.navigation.NavData
import com.jera.apptemplate.util.navigation.Navigator
import com.jera.apptemplate.util.viewmodel.DialogData
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment

open class BaseFragment : DaggerFragment() {

    private var dialog: Dialog? = null

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    open fun onGetDialog(dialogData: DialogData?) {
        dialogData?.let {
            dialog?.dismiss()
            dialog = activity?.showDialog(it)
        }
    }

    open fun onGoTo(navData: NavData?) {
        navData?.let {
            Navigator.goTo(activity, it)
        }
    }
}