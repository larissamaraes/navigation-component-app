package com.jera.apptemplate.data.client

import com.jera.apptemplate.data.entity.ApiUser
import io.reactivex.Single
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService{

    @FormUrlEncoded
    @POST("users/sign_in")
    fun signIn(@Field("email") email: String,
               @Field("password") password: String,
               @Field("token") token: String?,
               @Field("platform") platform: String): Single<Response<ApiUser>>

    @POST("users/sign_up")
    fun signUp(@Body requestBody: RequestBody): Single<Response<ApiUser>>

}