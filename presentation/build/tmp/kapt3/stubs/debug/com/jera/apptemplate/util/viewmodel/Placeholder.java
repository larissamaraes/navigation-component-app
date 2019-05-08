package com.jera.apptemplate.util.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bBC\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0003R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u0082\u0001\u0004\u001c\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "", "messageVisible", "", "message", "", "buttonVisible", "buttonText", "progressVisible", "buttonAction", "Lkotlin/Function0;", "", "(ZLjava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getButtonAction", "()Lkotlin/jvm/functions/Function0;", "getButtonText", "()Ljava/lang/String;", "getButtonVisible", "()Z", "getMessage", "getMessageVisible", "getProgressVisible", "onActionButtonClicked", "visible", "Action", "HideAll", "Loading", "Message", "Lcom/jera/apptemplate/util/viewmodel/Placeholder$Loading;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder$Message;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder$Action;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder$HideAll;", "presentation_debug"})
public abstract class Placeholder {
    private final boolean messageVisible = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    private final boolean buttonVisible = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String buttonText = null;
    private final boolean progressVisible = false;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> buttonAction = null;
    
    public final boolean visible() {
        return false;
    }
    
    public final void onActionButtonClicked() {
    }
    
    public final boolean getMessageVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean getButtonVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getButtonText() {
        return null;
    }
    
    public final boolean getProgressVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getButtonAction() {
        return null;
    }
    
    private Placeholder(boolean messageVisible, java.lang.String message, boolean buttonVisible, java.lang.String buttonText, boolean progressVisible, kotlin.jvm.functions.Function0<kotlin.Unit> buttonAction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jera/apptemplate/util/viewmodel/Placeholder$Loading;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "message", "", "(Ljava/lang/String;)V", "presentation_debug"})
    public static final class Loading extends com.jera.apptemplate.util.viewmodel.Placeholder {
        
        public Loading(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(false, null, false, null, false, null);
        }
        
        public Loading() {
            super(false, null, false, null, false, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jera/apptemplate/util/viewmodel/Placeholder$Message;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "message", "", "(Ljava/lang/String;)V", "presentation_debug"})
    public static final class Message extends com.jera.apptemplate.util.viewmodel.Placeholder {
        
        public Message(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super(false, null, false, null, false, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/jera/apptemplate/util/viewmodel/Placeholder$Action;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "message", "", "buttonText", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "presentation_debug"})
    public static final class Action extends com.jera.apptemplate.util.viewmodel.Placeholder {
        
        public Action(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String buttonText, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function0<kotlin.Unit> action) {
            super(false, null, false, null, false, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/jera/apptemplate/util/viewmodel/Placeholder$HideAll;", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "()V", "presentation_debug"})
    public static final class HideAll extends com.jera.apptemplate.util.viewmodel.Placeholder {
        public static final com.jera.apptemplate.util.viewmodel.Placeholder.HideAll INSTANCE = null;
        
        private HideAll() {
            super(false, null, false, null, false, null);
        }
    }
}