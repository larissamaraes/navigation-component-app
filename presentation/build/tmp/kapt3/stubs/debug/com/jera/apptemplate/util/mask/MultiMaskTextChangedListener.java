package com.jera.apptemplate.util.mask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002J!\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0013R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/jera/apptemplate/util/mask/MultiMaskTextChangedListener;", "Lcom/jera/apptemplate/util/mask/BaseMaskTextChangedListener;", "editText", "Landroid/widget/EditText;", "masks", "", "", "(Landroid/widget/EditText;[Ljava/lang/String;)V", "reversed", "", "(Landroid/widget/EditText;Z[Ljava/lang/String;)V", "", "Lkotlin/Pair;", "", "applyMask", "text", "chooseMask", "makeMaskList", "", "([Ljava/lang/String;)V", "presentation_debug"})
public final class MultiMaskTextChangedListener extends com.jera.apptemplate.util.mask.BaseMaskTextChangedListener {
    private java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>> masks;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String applyMask(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean reversed) {
        return null;
    }
    
    private final java.lang.String chooseMask(java.lang.String text) {
        return null;
    }
    
    private final void makeMaskList(java.lang.String... masks) {
    }
    
    public MultiMaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean reversed, @org.jetbrains.annotations.NotNull()
    java.lang.String... masks) {
        super(null, false);
    }
    
    public MultiMaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    java.lang.String... masks) {
        super(null, false);
    }
}