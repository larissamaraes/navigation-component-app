package com.jera.apptemplate.util.viewmodel

import com.jera.apptemplate.domain.util.resource.Strings

class DialogData(
        val title: String,
        val message: String,
        val confirmButtonText: String? = null,
        val onConfirm: (() -> Unit)? = null,
        val dismissButtonText: String? = null,
        val onDismiss: (() -> Unit)? = null,
        val cancelable: Boolean? = true
) {
    companion object {

        fun confirm(title: String, message: String, onConfirm: () -> Unit, confirmButtonText: String? = null, cancelable: Boolean? = true): DialogData {
            return DialogData(title, message, confirmButtonText, onConfirm, null, null, cancelable)
        }

        fun dismiss(title: String, message: String, onDismiss: (() -> Unit)? = null, dismissButtonText: String? = null, cancelable: Boolean? = true): DialogData {
            return DialogData(title, message, null, null, dismissButtonText, onDismiss, cancelable)
        }

        fun message(title: String, message: String, onConfirm: (() -> Unit)? = null, onDismiss: (() -> Unit)? = null, cancelable: Boolean? = true): DialogData {
            return DialogData(title, message, null, onConfirm, null, onDismiss, cancelable)
        }

        fun error(strings: Strings, message: String, confirmButtonText: String? = null, onConfirm: (() -> Unit)? = null, onDismiss: (() -> Unit)? = null, cancelable: Boolean? = true): DialogData {
            return DialogData(strings.errorTitle, message, confirmButtonText, onConfirm, null, onDismiss, cancelable)
        }

        fun yesOrNo(strings: Strings, title: String, message: String, onConfirm: () -> Unit, onDismiss: (() -> Unit)? = null, cancelable: Boolean? = true): DialogData {
            return DialogData(title, message, strings.globalYes, onConfirm, strings.globalNo, onDismiss, cancelable)
        }
    }
}
