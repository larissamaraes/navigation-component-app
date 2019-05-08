package com.jera.apptemplate.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\t\u001a\u00020\b*\u00020\n2\u0006\u0010\u000b\u001a\u00020\b\u001a4\u0010\f\u001a\u00020\r*\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\u0013\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0012\u0010\u0016\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010\u0017\u001a\u00020\r*\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u0003*\u00020\n\u001a\u001e\u0010\u001a\u001a\u00020\r*\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u001a*\u0010\u001a\u001a\u00020\r*\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u001a&\u0010\u001f\u001a\u00020\r*\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0003H\u0002\u001a\n\u0010 \u001a\u00020\r*\u00020\u0018\u001a\n\u0010!\u001a\u00020\r*\u00020\u0018\u001a\n\u0010\"\u001a\u00020\r*\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"STARTED_FOR_RESULT", "", "easyImageWillHandleResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "addStartedForResultFlag", "Landroid/app/Activity;", "intent", "emitEasyImageResult", "", "emitter", "Lio/reactivex/SingleEmitter;", "Ljava/io/File;", "handleEasyImageResult", "Lio/reactivex/Single;", "handleHomeButtonClick", "item", "Landroid/view/MenuItem;", "handleMenuItemClick", "hideSoftKeyboard", "Landroid/support/v7/app/AppCompatActivity;", "isStartedForResult", "setupToolbar", "toolbar", "Landroid/support/v7/widget/Toolbar;", "showHome", "title", "setupToolbarWithTitle", "showHomeButton", "showSoftKeyboard", "startEasyImageActivity", "presentation_debug"})
public final class ActivityExtensionsKt {
    private static final java.lang.String STARTED_FOR_RESULT = "STARTED_FOR_RESULT";
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent addStartedForResultFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    public static final boolean isStartedForResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
        return false;
    }
    
    public static final void showHomeButton(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver) {
    }
    
    public static final boolean handleMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public static final boolean handleHomeButtonClick(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public static final void setupToolbar(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, @org.jetbrains.annotations.Nullable()
    android.support.v7.widget.Toolbar toolbar, boolean showHome, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    private static final void setupToolbar(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, android.support.v7.widget.Toolbar toolbar, boolean showHome) {
    }
    
    private static final void setupToolbarWithTitle(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, android.support.v7.widget.Toolbar toolbar, java.lang.String title, boolean showHome) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver) {
    }
    
    public static final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver) {
    }
    
    public static final void startEasyImageActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
    }
    
    public static final boolean easyImageWillHandleResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<java.io.File> handleEasyImageResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
        return null;
    }
    
    private static final void emitEasyImageResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, io.reactivex.SingleEmitter<java.io.File> emitter, int requestCode, int resultCode, android.content.Intent data) {
    }
}