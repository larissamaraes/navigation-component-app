package com.jera.apptemplate.presentation.graph.module;

import android.app.Activity;
import com.jera.apptemplate.presentation.graph.scope.ActivityScope;
import com.jera.apptemplate.presentation.view.user.signin.LogInActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_ContributeLoginScreen.LogInActivitySubcomponent.class)
public abstract class ActivityBindingModule_ContributeLoginScreen {
  private ActivityBindingModule_ContributeLoginScreen() {}

  @Binds
  @IntoMap
  @ActivityKey(LogInActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LogInActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface LogInActivitySubcomponent extends AndroidInjector<LogInActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LogInActivity> {}
  }
}
