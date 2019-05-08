
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a%\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a%\u0010\f\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a%\u0010\r\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\b*\u00020\u000f\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012\u001a\u0012\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a5\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0016\u001a-\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0017\u001a/\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0018\u001a7\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0013\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u001e\u0010\u001b\u001a\u00020\u0005*\u00020\u000f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u001d\u001a \u0010\u001b\u001a\u0004\u0018\u00010\u001e*\u00020\u001f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u001d\u001a\u001b\u0010 \u001a\u00020\u0005*\u00020\u000f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00020\u0005*\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050$\u001a\u0012\u0010%\u001a\u00020\u0005*\u00020\u00122\u0006\u0010&\u001a\u00020\u0011\u00a8\u0006\'"}, d2 = {"placeholderOptions", "Lcom/bumptech/glide/request/RequestOptions;", "placeholder", "Landroid/graphics/drawable/Drawable;", "centerCrop", "", "Landroid/widget/ImageView;", "url", "", "placeholderRes", "", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "centerInside", "circleCrop", "getText", "Landroid/support/design/widget/TextInputLayout;", "isVisible", "", "Landroid/view/View;", "load", "placeholderDrawable", "rounded", "(Landroid/widget/ImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "options", "observeChanges", "callback", "Lkotlin/Function1;", "Lio/reactivex/disposables/Disposable;", "Landroid/widget/TextView;", "setError", "messageId", "(Landroid/support/design/widget/TextInputLayout;Ljava/lang/Integer;)V", "setOnClickListener", "Lkotlin/Function0;", "setVisible", "visible", "presentation_debug"})
public final class ViewExtensionsKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getText(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver) {
        return null;
    }
    
    public static final void observeChanges(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public static final void setError(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.TextInputLayout $receiver, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.StringRes()
    java.lang.Integer messageId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final io.reactivex.disposables.Disposable observeChanges(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        return null;
    }
    
    public static final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void setVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean visible) {
    }
    
    public static final boolean isVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
        return false;
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean centerCrop) {
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rounded, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes) {
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rounded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean centerCrop) {
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholderDrawable, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rounded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean centerCrop) {
    }
    
    public static final void centerInside(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes) {
    }
    
    public static final void centerInside(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    public static final void centerCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes) {
    }
    
    public static final void centerCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    public static final void circleCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    @android.support.annotation.DrawableRes()
    java.lang.Integer placeholderRes) {
    }
    
    public static final void circleCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeholder) {
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.request.RequestOptions options) {
    }
    
    private static final com.bumptech.glide.request.RequestOptions placeholderOptions(android.graphics.drawable.Drawable placeholder) {
        return null;
    }
}