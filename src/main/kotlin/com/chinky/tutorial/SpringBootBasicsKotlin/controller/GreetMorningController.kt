package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetMorningController {
    /**
     * Make sure to add distinctive and unique mappings otherwise the URL will not work.
     * */
    @GetMapping("/greetMorning")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Good Morning, $name!"
    }
}