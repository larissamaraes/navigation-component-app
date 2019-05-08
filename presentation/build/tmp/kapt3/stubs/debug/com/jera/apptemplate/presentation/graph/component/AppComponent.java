package com.jera.apptemplate.presentation.graph.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/component/AppComponent;", "", "inject", "Lcom/jera/apptemplate/presentation/AppTemplateApplication;", "appTemplateApplication", "Builder", "presentation_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, dagger.android.support.AndroidSupportInjectionModule.class, com.jera.apptemplate.presentation.graph.module.ApplicationBindingModule.class, com.jera.apptemplate.presentation.graph.module.ApplicationProviderModule.class, com.jera.apptemplate.presentation.graph.module.ApiProviderModule.class, com.jera.apptemplate.presentation.graph.module.ActivityBindingModule.class, com.jera.apptemplate.presentation.graph.module.MapperModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jera.apptemplate.presentation.AppTemplateApplication inject(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.presentation.AppTemplateApplication appTemplateApplication);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/component/AppComponent$Builder;", "", "build", "Lcom/jera/apptemplate/presentation/graph/component/AppComponent;", "context", "Landroid/content/Context;", "presentation_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.jera.apptemplate.presentation.graph.component.AppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.jera.apptemplate.presentation.graph.component.AppComponent build();
    }
}