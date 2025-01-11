package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import com.chinky.tutorial.SpringBootBasicsKotlin.service.StudentPagingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentPagingController(@Autowired private val studentService: StudentPagingService) {

    @GetMapping("studentsToAndFrom")
    fun getStudentToAndFrom(
        @RequestParam(value = "page", defaultValue = "0") page: Int,
        @RequestParam(value = "size", defaultValue = "0") size: Int
    ): Page<Student> =
        studentService.getStudentToAndFrom(page, size)

}