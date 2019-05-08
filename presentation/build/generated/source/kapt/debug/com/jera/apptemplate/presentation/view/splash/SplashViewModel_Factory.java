// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation.view.splash;

import com.jera.apptemplate.domain.interactors.user.GetPersistedUser;
import com.jera.apptemplate.util.base.BaseViewModel_MembersInjector;
import com.jera.apptemplate.util.error.ErrorHandler;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<GetPersistedUser> getPersistedUserProvider;

  private final Provider<ErrorHandler> errorHandlerProvider;

  public SplashViewModel_Factory(
      Provider<GetPersistedUser> getPersistedUserProvider,
      Provider<ErrorHandler> errorHandlerProvider) {
    this.getPersistedUserProvider = getPersistedUserProvider;
    this.errorHandlerProvider = errorHandlerProvider;
  }

  @Override
  public SplashViewModel get() {
    SplashViewModel instance = new SplashViewModel(getPersistedUserProvider.get());
    BaseViewModel_MembersInjector.injectErrorHandler(instance, errorHandlerProvider.get());
    return instance;
  }

  public static SplashViewModel_Factory create(
      Provider<GetPersistedUser> getPersistedUserProvider,
      Provider<ErrorHandler> errorHandlerProvider) {
    return new SplashViewModel_Factory(getPersistedUserProvider, errorHandlerProvider);
  }

  public static SplashViewModel newSplashViewModel(GetPersistedUser getPersistedUser) {
    return new SplashViewModel(getPersistedUser);
  }
}
