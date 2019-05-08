package com.jera.apptemplate.data.mappers

import com.jera.apptemplate.data.entity.ApiErrors
import com.jera.apptemplate.data.util.mapper.Mapper
import com.jera.apptemplate.domain.entity.Errors
import javax.inject.Inject

class ApiErrorToErrorMapper @Inject constructor() : Mapper<ApiErrors, Errors>() {
    override fun transform(t: ApiErrors) = Errors(
            errorMessage = t.errorMessage, errors = t.errors
    )
}