package com.jera.apptemplate.data.mappers

import com.jera.apptemplate.data.entity.ApiUser
import com.jera.apptemplate.data.util.mapper.Mapper
import com.jera.apptemplate.domain.entity.User
import javax.inject.Inject

class ApiUserToUserMapper @Inject constructor() : Mapper<ApiUser, User>() {
    override fun transform(t: ApiUser) = User(
            id = t.id,
            name = t.name,
            phone = t.phone,
            email = t.email,
            token = t.token,
            avatarUrl = t.avatar?.medium,
            avatarThumbUrl = t.avatar?.thumb
    )
}