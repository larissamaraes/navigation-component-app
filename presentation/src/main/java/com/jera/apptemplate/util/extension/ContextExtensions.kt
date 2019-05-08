package com.jera.apptemplate.util.extension

import android.app.AlertDialog
import android.app.Dialog
import android.content.*
import android.support.annotation.StringRes
import android.support.v4.content.LocalBroadcastManager
import android.widget.Toast
import com.jera.apptemplate.R
import com.jera.apptemplate.util.viewmodel.DialogData

fun Context.showDialog(dialogData: DialogData): Dialog {
    val builder = AlertDialog.Builder(this)
    builder.setTitle(dialogData.title)
    builder.setMessage(dialogData.message)
    if (dialogData.confirmButtonText == null && dialogData.onConfirm == null) {
        builder.setPositiveButton(dialogData.dismissButtonText, dialogData.onDismiss)
    } else {
        builder.setPositiveButton(dialogData.confirmButtonText, dialogData.onConfirm
                ?: dialogData.onDismiss)
        if (dialogData.dismissButtonText != null || dialogData.onDismiss != null) {
            builder.setNegativeButton(dialogData.dismissButtonText, dialogData.onDismiss)
        }
    }
    dialogData.onDismiss?.let { builder.setOnCancelListener { it() } }
    builder.setCancelable(dialogData.cancelable ?: true)
    return builder.show()
}

fun AlertDialog.Builder.setPositiveButton(buttonText: String?, onClick: (() -> Unit)?) = setPositiveButton(
        buttonText ?: context.getString(R.string.global_ok),
        onClick?.let { { _: DialogInterface, _: Int -> it() } }
)

fun AlertDialog.Builder.setNegativeButton(buttonText: String?, onClick: (() -> Unit)?) = setNegativeButton(
        buttonText ?: context.getString(R.string.global_cancel),
        onClick?.let { { _: DialogInterface, _: Int -> it() } }
)


/* Toast */
fun Context.shortToast(@StringRes messageId: Int) = shortToast(getString(messageId))

fun Context.shortToast(@StringRes message: String) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.longToast(@StringRes messageId: Int) = longToast(getString(messageId))

fun Context.longToast(@StringRes message: String) =
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()

/* Broadcast */
//Broadcast Receivers

fun Context.registerLocalReceiver(action: String, callback: (context: Context?, intent: Intent?) -> Unit): BroadcastReceiver {
    val broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(c: Context?, i: Intent?) = callback(c, i)
    }
    val filter = IntentFilter(action)
    LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, filter)
    return broadcastReceiver
}

fun Context.unregisterLocalReceiver(broadcastReceiver: BroadcastReceiver) {
    LocalBroadcastManager.getInstance(this).unregisterReceiver(broadcastReceiver)
}

