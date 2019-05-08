package com.jera.apptemplate.presentation.graph.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/jera/apptemplate/presentation/graph/module/MapperModule;", "", "bindApiErrorToErrorMapper", "Lcom/jera/apptemplate/data/util/mapper/Mapper;", "Lcom/jera/apptemplate/data/entity/ApiErrors;", "Lcom/jera/apptemplate/domain/entity/Errors;", "apiErrorToErrorMapper", "Lcom/jera/apptemplate/data/mappers/ApiErrorToErrorMapper;", "bindApiUserToUserMapper", "Lcom/jera/apptemplate/data/entity/ApiUser;", "Lcom/jera/apptemplate/domain/entity/User;", "apiUserToUserMapper", "Lcom/jera/apptemplate/data/mappers/ApiUserToUserMapper;", "presentation_debug"})
@dagger.Module()
public abstract interface MapperModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.data.util.mapper.Mapper<com.jera.apptemplate.data.entity.ApiErrors, com.jera.apptemplate.domain.entity.Errors> bindApiErrorToErrorMapper(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.mappers.ApiErrorToErrorMapper apiErrorToErrorMapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.jera.apptemplate.data.util.mapper.Mapper<com.jera.apptemplate.data.entity.ApiUser, com.jera.apptemplate.domain.entity.User> bindApiUserToUserMapper(@org.jetbrains.annotations.NotNull()
    com.jera.apptemplate.data.mappers.ApiUserToUserMapper apiUserToUserMapper);
}