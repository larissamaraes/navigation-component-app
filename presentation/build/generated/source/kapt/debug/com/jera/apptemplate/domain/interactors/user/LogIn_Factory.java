// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.domain.interactors.user;

import com.jera.apptemplate.domain.boundary.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LogIn_Factory implements Factory<LogIn> {
  private final Provider<UserRepository> arg0Provider;

  public LogIn_Factory(Provider<UserRepository> arg0Provider) {
    this.arg0Provider = arg0Provider;
  }

  @Override
  public LogIn get() {
    return new LogIn(arg0Provider.get());
  }

  public static LogIn_Factory create(Provider<UserRepository> arg0Provider) {
    return new LogIn_Factory(arg0Provider);
  }
}
