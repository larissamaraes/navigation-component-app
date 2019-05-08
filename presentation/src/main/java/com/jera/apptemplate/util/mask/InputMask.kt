package com.jera.apptemplate.util.mask

import android.support.design.widget.TextInputLayout
import android.widget.EditText
import java.security.InvalidParameterException

object InputMask {

    fun apply(textInputLayout: TextInputLayout?, vararg masks: String): BaseMaskTextChangedListener {
        return apply(textInputLayout?.editText, *masks)
    }

    fun apply(editText: EditText?, vararg masks: String): BaseMaskTextChangedListener {
        if (editText == null || masks.isEmpty()) {
            throw InvalidParameterException("A EditText and a mask are required!")
        }
        val maskTextChangedListener: BaseMaskTextChangedListener
        if (masks.size > 1) {
            maskTextChangedListener = MultiMaskTextChangedListener(editText, *masks)
        } else {
            maskTextChangedListener = MaskTextChangedListener(masks[0], editText)
        }
        editText.addTextChangedListener(maskTextChangedListener)
        return maskTextChangedListener
    }

}