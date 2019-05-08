package com.jera.apptemplate.domain.interactors.user

import com.jera.apptemplate.domain.boundary.UserRepository
import com.jera.apptemplate.domain.entity.User
import com.jera.apptemplate.domain.util.field.FormFields
import io.reactivex.Single
import javax.inject.Inject

class LogIn @Inject constructor(private val repository: UserRepository) {

    fun execute(email: String, password: String, token: String?): Single<User> {
        return Single.just(FormFields().withEmail(email).withPassword(password))
                .doOnSuccess { formFields -> if (!formFields.isValid) throw formFields.exception }
                .flatMap { repository.signIn(email, password, token) }
                .doAfterSuccess { repository.cacheUser(it) }
    }
}