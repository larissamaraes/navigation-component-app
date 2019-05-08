package com.jera.apptemplate.presentation.graph.module;

import android.app.Activity;
import com.jera.apptemplate.presentation.graph.scope.ActivityScope;
import com.jera.apptemplate.presentation.view.user.signup.SignUpActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_ContributeSignUpScreen.SignUpActivitySubcomponent.class
)
public abstract class ActivityBindingModule_ContributeSignUpScreen {
  private ActivityBindingModule_ContributeSignUpScreen() {}

  @Binds
  @IntoMap
  @ActivityKey(SignUpActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SignUpActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface SignUpActivitySubcomponent extends AndroidInjector<SignUpActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SignUpActivity> {}
  }
}
