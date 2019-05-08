package com.jera.apptemplate.domain.boundary

import com.jera.apptemplate.domain.entity.User
import com.jera.apptemplate.domain.interactors.user.SignUp
import io.reactivex.Completable
import io.reactivex.Single

interface UserRepository {
    fun getCurrentFromRemote(): Single<User>
    fun signIn(email: String, password: String, token: String?): Single<User>
    fun signInWithFacebook(): Single<User>
    fun signUp(fields: SignUp.Fields): Single<User>
    fun sendPasswordRecovery(email: String): Completable
    fun cacheUser(user: User)
}