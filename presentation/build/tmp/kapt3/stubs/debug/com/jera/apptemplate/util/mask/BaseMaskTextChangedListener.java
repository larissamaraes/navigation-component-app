package com.jera.apptemplate.util.mask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H$J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/jera/apptemplate/util/mask/BaseMaskTextChangedListener;", "Lcom/jera/apptemplate/util/watcher/SimpleTextWatcher;", "editText", "Landroid/widget/EditText;", "reversed", "", "(Landroid/widget/EditText;Z)V", "isUpdating", "oldText", "", "textMasker", "Lcom/jera/apptemplate/util/mask/TextMasker;", "getTextMasker", "()Lcom/jera/apptemplate/util/mask/TextMasker;", "applyMask", "text", "onTextChanged", "", "s", "", "start", "", "before", "count", "Companion", "presentation_debug"})
public abstract class BaseMaskTextChangedListener extends com.jera.apptemplate.util.watcher.SimpleTextWatcher {
    private boolean isUpdating;
    private java.lang.String oldText;
    @org.jetbrains.annotations.NotNull()
    private final com.jera.apptemplate.util.mask.TextMasker textMasker = null;
    private final android.widget.EditText editText = null;
    private final boolean reversed = false;
    public static final com.jera.apptemplate.util.mask.BaseMaskTextChangedListener.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.jera.apptemplate.util.mask.TextMasker getTextMasker() {
        return null;
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.String applyMask(@org.jetbrains.annotations.Nullable()
    java.lang.String text, boolean reversed);
    
    public BaseMaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, boolean reversed) {
        super();
    }
    
    public BaseMaskTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/jera/apptemplate/util/mask/BaseMaskTextChangedListener$Companion;", "", "()V", "applyMask", "", "mask", "text", "applyReversedMask", "presentation_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String applyReversedMask(@org.jetbrains.annotations.Nullable()
        java.lang.String mask, @org.jetbrains.annotations.Nullable()
        java.lang.String text) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String applyMask(@org.jetbrains.annotations.NotNull()
        java.lang.String mask, @org.jetbrains.annotations.Nullable()
        java.lang.String text) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}