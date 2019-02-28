package com.edomingues.validationexample

import org.springframework.format.annotation.DateTimeFormat
import javax.validation.Valid
import javax.validation.constraints.*
import org.springframework.format.annotation.DateTimeFormat.ISO
import java.util.*

data class User(

        @get: NotBlank
        var firstName: String = "",

        @get: NotBlank
        var lastName: String  = "",

        @get: NotBlank
        @get: Email(message = "{email.invalid}")
        var email: String = "",

        @field: DateTimeFormat(iso = ISO.DATE)
        @get: NotNull
        @get: Past
        var dateOfBirth: Date? = null,

        @get: NotNull
        var numberOfDependents: Int? = 0,

        @get: Size(min = 10, max = 200)
        var aboutMe: String = "",

        @get: Valid
        var address: Address = Address(),

        @get: NotNull
        var premium: Boolean? = null,

        var receiveNewsletter: Boolean = false,

        @get: AssertTrue(message = "{agreedToTermsAndConditions.invalid}")
        var agreedToTermsAndConditions: Boolean = false

)