package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import com.chinky.tutorial.SpringBootBasicsKotlin.repository.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(@Autowired val testRepository: TestRepository) {

    @GetMapping
    fun getAll() = testRepository.findAll();
}