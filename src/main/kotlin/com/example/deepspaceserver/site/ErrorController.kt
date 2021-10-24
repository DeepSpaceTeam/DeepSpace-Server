package com.example.deepspaceserver.site

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.RequestDispatcher
import javax.servlet.http.HttpServletRequest

@Controller
class MyErrorController : ErrorController {

    @RequestMapping("/error")
    fun handleError(model: Model, request: HttpServletRequest): String {
        val status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)
        if (status != null) {
            model.addAttribute("code", status.toString())
        }
        return "error"
    }

    override fun getErrorPath(): String {
        return "/error"
    }
}