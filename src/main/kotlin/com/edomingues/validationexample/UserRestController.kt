package com.edomingues.validationexample

import org.springframework.http.ResponseEntity
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.validation.Valid

@RestController
class UserRestController {
	
	@PostMapping("/rest/users")
	fun postUser(@Valid @RequestBody user:User):User {
		println()
		println(" -> User is valid: " + user)
		println()
		return user
	}

	@PostMapping("/rest/2/users")
	fun postUser(@Valid @RequestBody user:User, errors: Errors): ResponseEntity<Any> {
		when {
			errors.hasErrors() -> {
				println()
				println(" -> User has errors: " + errors.allErrors)
				println()
                return ResponseEntity.badRequest().body(errors.allErrors)
            }
			else -> {
				println()
				println(" -> User is valid: " + user)
				println()
                return ResponseEntity.ok(user)
            }
		}
	}

}
