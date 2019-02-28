package com.edomingues.validationexample

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping
class RootWebController {

    @GetMapping
    fun getIndex() = "redirect:/index.html"

}
