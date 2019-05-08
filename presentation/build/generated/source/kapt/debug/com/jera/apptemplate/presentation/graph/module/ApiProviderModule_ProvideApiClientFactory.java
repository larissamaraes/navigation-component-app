// Generated by Dagger (https://google.github.io/dagger).
package com.jera.apptemplate.presentation.graph.module;

import com.jera.apptemplate.data.client.ApiClient;
import com.jera.apptemplate.data.client.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ApiProviderModule_ProvideApiClientFactory implements Factory<ApiClient> {
  private final ApiProviderModule module;

  private final Provider<ApiService> apiServiceProvider;

  public ApiProviderModule_ProvideApiClientFactory(
      ApiProviderModule module, Provider<ApiService> apiServiceProvider) {
    this.module = module;
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public ApiClient get() {
    return Preconditions.checkNotNull(
        module.provideApiClient(apiServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApiProviderModule_ProvideApiClientFactory create(
      ApiProviderModule module, Provider<ApiService> apiServiceProvider) {
    return new ApiProviderModule_ProvideApiClientFactory(module, apiServiceProvider);
  }

  public static ApiClient proxyProvideApiClient(ApiProviderModule instance, ApiService apiService) {
    return Preconditions.checkNotNull(
        instance.provideApiClient(apiService),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}