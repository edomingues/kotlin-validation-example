package com.edomingues.validationexample

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.context.WebApplicationContext
import javax.validation.Valid

@Controller
@RequestMapping("/web/users")
@Scope(WebApplicationContext.SCOPE_REQUEST)
class UserWebController {

    @GetMapping
    fun doGet(model: Model): String {
        model.addAttribute("user", User())
        return "user"
    }

    @PostMapping
    fun doPost(model: Model, @Valid user: User, errors: Errors): String  {
        when {
            errors.hasErrors() -> {
                println()
                println(" ---> User has errors: " + errors)
                println()
                return "user"
            }
            else -> {
                println()
                println(" ---> User is valid: " + user)
                println()
                model.addAttribute("isSuccess", true)
                return "user"
            }
        }
    }
}
