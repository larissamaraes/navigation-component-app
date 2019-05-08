package com.jera.apptemplate.data.client

import com.jera.apptemplate.data.entity.ApiUser
import com.jera.apptemplate.data.util.request.MultiPartBodyCreator
import com.jera.apptemplate.data.util.request.RequestHandler
import com.jera.apptemplate.data.util.resources.PLATFORM_CONSTANT
import io.reactivex.Single
import javax.inject.Inject

class ApiClient @Inject constructor(
        private val apiService: ApiService
) : RequestHandler() {

    fun signIn(email: String, password: String, token: String?): Single<ApiUser> {
        return makeRequest(apiService.signIn(email, password, token, PLATFORM_CONSTANT))
    }

    fun signUp(fields: HashMap<String, String?>): Single<ApiUser> {
        return Single.just(fields).map { MultiPartBodyCreator.execute(it.toMap()) }
                .flatMap { makeRequest(apiService.signUp(it)) }
    }
}