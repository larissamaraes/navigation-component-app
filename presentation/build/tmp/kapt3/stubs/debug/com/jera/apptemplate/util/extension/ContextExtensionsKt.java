package com.jera.apptemplate.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001aN\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0002\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0015\u0012\u0013\u0018\u00010\u000f\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u000b\u001a,\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u001a,\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012*\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0019\u001a\u00020\u001a*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\b\u00a8\u0006\u001f"}, d2 = {"longToast", "", "Landroid/content/Context;", "messageId", "", "message", "", "registerLocalReceiver", "Landroid/content/BroadcastReceiver;", "action", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "context", "Landroid/content/Intent;", "intent", "setNegativeButton", "Landroid/app/AlertDialog$Builder;", "kotlin.jvm.PlatformType", "buttonText", "onClick", "Lkotlin/Function0;", "setPositiveButton", "shortToast", "showDialog", "Landroid/app/Dialog;", "dialogData", "Lcom/jera/apptemplate/util/viewmodel/DialogData;", "unregisterLocalReceiver", "broadcastReceiver", "presentation_debug"})
public final class ContextExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final android.app.Dialog showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.util.viewmodel.DialogData dialogData) {
        return null;
    }
    
    public static final android.app.AlertDialog.Builder setPositiveButton(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog.Builder $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    public static final android.app.AlertDialog.Builder setNegativeButton(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog.Builder $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        return null;
    }
    
    public static final void shortToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @android.support.annotation.StringRes()
    int messageId) {
    }
    
    public static final void shortToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    @android.support.annotation.StringRes()
    java.lang.String message) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @android.support.annotation.StringRes()
    int messageId) {
    }
    
    public static final void longToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    @android.support.annotation.StringRes()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.BroadcastReceiver registerLocalReceiver(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.content.Context, ? super android.content.Intent, kotlin.Unit> callback) {
        return null;
    }
    
    public static final void unregisterLocalReceiver(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver broadcastReceiver) {
    }
}