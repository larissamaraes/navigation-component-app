// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.util.base;

import com.jera.apptemplate.util.error.ErrorHandler;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
  private final Provider<ErrorHandler> errorHandlerProvider;

  public BaseViewModel_MembersInjector(Provider<ErrorHandler> errorHandlerProvider) {
    this.errorHandlerProvider = errorHandlerProvider;
  }

  public static MembersInjector<BaseViewModel> create(Provider<ErrorHandler> errorHandlerProvider) {
    return new BaseViewModel_MembersInjector(errorHandlerProvider);
  }

  @Override
  public void injectMembers(BaseViewModel instance) {
    injectErrorHandler(instance, errorHandlerProvider.get());
  }

  public static void injectErrorHandler(BaseViewModel instance, ErrorHandler errorHandler) {
    instance.errorHandler = errorHandler;
  }
}