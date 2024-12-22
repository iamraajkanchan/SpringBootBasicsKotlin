package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    /**
     * The spelling of the value in RequestParam must match with Parameter used in the function.
     * ex: value is "name" in RequestParam and parameter is also name in method parameter. Because there is a match
     * value passed in the name parameter in the URL will reflect in the response.
     * */
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }
}