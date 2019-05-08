package com.jera.apptemplate.util.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jera/apptemplate/util/base/BaseFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "dialog", "Landroid/app/Dialog;", "onAttach", "", "context", "Landroid/content/Context;", "onGetDialog", "dialogData", "Lcom/jera/apptemplate/util/viewmodel/DialogData;", "onGoTo", "navData", "Lcom/jera/apptemplate/util/navigation/NavData;", "presentation_debug"})
public class BaseFragment extends dagger.android.support.DaggerFragment {
    private android.app.Dialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public void onGetDialog(@org.jetbrains.annotations.Nullable()
    com.jera.apptemplate.util.viewmodel.DialogData dialogData) {
    }
    
    public void onGoTo(@org.jetbrains.annotations.Nullable()
    com.jera.apptemplate.util.navigation.NavData navData) {
    }
    
    public BaseFragment() {
        super();
    }
}