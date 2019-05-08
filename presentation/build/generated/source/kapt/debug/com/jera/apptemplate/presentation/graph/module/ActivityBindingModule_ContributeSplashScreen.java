package com.jera.apptemplate.presentation.graph.module;

import android.app.Activity;
import com.jera.apptemplate.presentation.graph.scope.ActivityScope;
import com.jera.apptemplate.presentation.view.splash.SplashActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_ContributeSplashScreen.SplashActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ContributeSplashScreen {
  private ActivityBindingModule_ContributeSplashScreen() {}

  @Binds
  @IntoMap
  @ActivityKey(SplashActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SplashActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SplashActivitySubcomponent extends AndroidInjector<SplashActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity> {}
  }
}
