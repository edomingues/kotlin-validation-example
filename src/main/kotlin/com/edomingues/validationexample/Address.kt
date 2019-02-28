package com.edomingues.validationexample

import javax.validation.constraints.NotBlank

data class Address (
        @get: NotBlank
        var street: String = "",

        @get: NotBlank
        var city: String = "",

        @get: NotBlank
        var postalCode: String = "",

        @get: NotBlank
        var country: String = ""
)
