package com.jera.apptemplate.presentation.graph.module

import com.jera.apptemplate.data.entity.ApiErrors
import com.jera.apptemplate.data.entity.ApiUser
import com.jera.apptemplate.data.mappers.ApiErrorToErrorMapper
import com.jera.apptemplate.data.mappers.ApiUserToUserMapper
import com.jera.apptemplate.data.util.mapper.Mapper
import com.jera.apptemplate.domain.entity.Errors
import com.jera.apptemplate.domain.entity.User
import dagger.Binds
import dagger.Module

@Module
interface MapperModule {
    @Binds
    fun bindApiErrorToErrorMapper(apiErrorToErrorMapper: ApiErrorToErrorMapper): Mapper<ApiErrors, Errors>

    @Binds
    fun bindApiUserToUserMapper(apiUserToUserMapper: ApiUserToUserMapper): Mapper<ApiUser, User>
}