package com.jera.apptemplate.domain.entity

import java.io.Serializable

data class Errors(
        val errorMessage: String? = null,
        val errors: ArrayList<String>? = null
): Serializable