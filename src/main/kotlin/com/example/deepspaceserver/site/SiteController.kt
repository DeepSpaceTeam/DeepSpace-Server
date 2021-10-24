package com.example.deepspaceserver.site

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.RequestDispatcher
import javax.servlet.http.HttpServletRequest
import kotlin.random.Random

@Controller
@Api("Отвечает за всё, что видит пользователь")
class SiteController {

    @GetMapping("/")
    @ApiOperation("Это главная страница нашего сайта!")
    fun index(model: Model): String {
        model.addAttribute("rnd", Random.nextInt(-10000, 10000))
        return "index"
    }
}