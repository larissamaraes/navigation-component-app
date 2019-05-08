package com.jera.apptemplate.domain.interactors.user

import com.jera.apptemplate.domain.boundary.UserRepository
import com.jera.apptemplate.domain.entity.User
import com.jera.apptemplate.domain.util.field.FormFields
import io.reactivex.Single
import javax.inject.Inject

class SignUp @Inject constructor(private val userRepository: UserRepository) {

    fun execute(fields: SignUp.Fields): Single<User> {
        return Single.just(
                FormFields()
                        .withName(fields.name)
                        .withEmail(fields.email)
                        .withPhoneNumber(fields.phoneNumber)
                        .withCpf(fields.cpf)
                        .withPassword(fields.password)
                        .withPasswordConfirmation(fields.passwordConfirmation)
        )
                .doOnSuccess { formFields -> if (!formFields.isValid) throw formFields.exception }
                .flatMap { _ -> userRepository.signUp(fields) }
                .doAfterSuccess { userRepository.cacheUser(it) }
    }

    class Fields(
            val name: String,
            val email: String,
            val phoneNumber: String,
            val cpf: String,
            val password: String,
            val passwordConfirmation: String,
            val avatar: String?
    )
}