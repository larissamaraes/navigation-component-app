// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.domain.interactors.user;

import com.jera.apptemplate.domain.boundary.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SignUp_Factory implements Factory<SignUp> {
  private final Provider<UserRepository> arg0Provider;

  public SignUp_Factory(Provider<UserRepository> arg0Provider) {
    this.arg0Provider = arg0Provider;
  }

  @Override
  public SignUp get() {
    return new SignUp(arg0Provider.get());
  }

  public static SignUp_Factory create(Provider<UserRepository> arg0Provider) {
    return new SignUp_Factory(arg0Provider);
  }
}