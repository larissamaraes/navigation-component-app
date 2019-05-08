package com.jera.apptemplate.data.repository

import com.jera.apptemplate.data.client.ApiClient
import com.jera.apptemplate.data.entity.ApiUser
import com.jera.apptemplate.data.util.mapper.Mapper
import com.jera.apptemplate.domain.boundary.UserRepository
import com.jera.apptemplate.domain.entity.Fields
import com.jera.apptemplate.domain.entity.User
import com.jera.apptemplate.domain.interactors.user.SignUp
import com.jera.apptemplate.domain.util.resource.CURRENT_USER
import com.jera.apptemplate.domain.util.storage.Cache
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class DefaultUserRepository @Inject constructor(
        private val apiClient: ApiClient,
        private val cache: Cache,
        private val userMapper: Mapper<ApiUser, User>
) : UserRepository {

    override fun signUp(user: SignUp.Fields): Single<User> {
        return apiClient.signUp(
                Fields.with("name", user.name)
                        .and("email", user.email)
                        .and("phone_number", user.phoneNumber)
                        .and("cpf", user.cpf)
                        .and("password", user.password)
                        .and("avatar", user.avatar)
        )
                .map(userMapper::transform)
                .doOnSuccess(({ this.cacheUser(it) }))
    }

    override fun getCurrentFromRemote(): Single<User> {
        TODO("Not implemented")
    }

    override fun signIn(email: String, password: String, token: String?): Single<User> {
        return apiClient.signIn(email, password, token).map(userMapper::transform)
    }

    override fun signInWithFacebook(): Single<User> {
        TODO("not implemented")
    }

    override fun sendPasswordRecovery(email: String): Completable {
        TODO("not implemented")
    }

    override fun cacheUser(user: User) {
        cache.set(CURRENT_USER, user)
    }
}