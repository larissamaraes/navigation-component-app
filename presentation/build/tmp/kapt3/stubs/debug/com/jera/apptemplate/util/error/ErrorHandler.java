package com.jera.apptemplate.util.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\"\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\"\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J \u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J \u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0012\u0010!\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\u001a\u0010#\u001a\u00020\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/jera/apptemplate/util/error/ErrorHandler;", "", "strings", "Lcom/jera/apptemplate/domain/util/resource/Strings;", "logger", "Lcom/jera/apptemplate/domain/util/logger/Logger;", "loginAction", "Lkotlin/Function0;", "", "(Lcom/jera/apptemplate/domain/util/resource/Strings;Lcom/jera/apptemplate/domain/util/logger/Logger;Lkotlin/jvm/functions/Function0;)V", "getDialogData", "Lcom/jera/apptemplate/util/viewmodel/DialogData;", "throwable", "", "retryAction", "onDismiss", "getPlaceholder", "Lcom/jera/apptemplate/util/viewmodel/Placeholder;", "getUnknownErrorMessage", "", "getUnknownErrorPlaceholder", "handleError", "tryAgainAction", "handleRequestException", "exception", "Lcom/jera/apptemplate/data/util/request/RequestException;", "httpErrorData", "message", "notFoundErrorData", "errorMessage", "resolveHttpError", "timeoutErrorData", "tryAgainPlaceholder", "unProcessableEntityErrorData", "unauthorizedErrorData", "unexpectedErrorData", "presentation_debug"})
public final class ErrorHandler {
    private final com.jera.apptemplate.domain.util.resource.Strings strings = null;
    private final com.jera.apptemplate.domain.util.logger.Logger logger = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> loginAction = null;
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder handleError(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder handleRequestException(com.jera.apptemplate.data.util.request.RequestException exception, kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder resolveHttpError(com.jera.apptemplate.data.util.request.RequestException exception, kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder notFoundErrorData(java.lang.String errorMessage) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder unauthorizedErrorData(java.lang.String errorMessage) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder unProcessableEntityErrorData(java.lang.String errorMessage) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder httpErrorData(java.lang.String message, kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder timeoutErrorData(kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder unexpectedErrorData(kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder tryAgainPlaceholder(java.lang.String errorMessage, kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jera.apptemplate.util.viewmodel.Placeholder getPlaceholder(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryAction) {
        return null;
    }
    
    private final com.jera.apptemplate.util.viewmodel.Placeholder getUnknownErrorPlaceholder() {
        return null;
    }
    
    private final java.lang.String getUnknownErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jera.apptemplate.util.viewmodel.DialogData getDialogData(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> retryAction, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
        return null;
    }
    
    @javax.inject.Inject()
    public ErrorHandler(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.resource.Strings strings, @org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.domain.util.logger.Logger logger, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "NAME_LOGIN_ACTION")
    kotlin.jvm.functions.Function0<kotlin.Unit> loginAction) {
        super();
    }
}