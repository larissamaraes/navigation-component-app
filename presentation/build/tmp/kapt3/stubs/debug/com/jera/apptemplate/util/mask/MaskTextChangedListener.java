package com.jera.apptemplate.util.mask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jera/apptemplate/util/mask/MaskTextChangedListener;", "Lcom/jera/apptemplate/util/mask/BaseMaskTextChangedListener;", "mask", "", "editText", "Landroid/widget/EditText;", "reversed", "", "(Ljava/lang/String;Landroid/widget/EditText;Z)V", "applyMask", "text", "presentation_debug"})
public final class MaskTextChangedListener extends com.jera.apptemplate.util.mask.BaseMaskTextChangedListener {
    private final java.lang.String mask = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String applyMask(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean reversed) {
        return null;
    }
    
    public MaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    java.lang.String mask, @org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean reversed) {
        super(null, false);
    }
    
    public MaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    java.lang.String mask, @org.jetbrains.annotations.NotNull()
    android.widget.EditText editText) {
        super(null, false);
    }
}