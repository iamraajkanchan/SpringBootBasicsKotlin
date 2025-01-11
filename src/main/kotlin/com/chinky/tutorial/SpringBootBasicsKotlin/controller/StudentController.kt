package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import com.chinky.tutorial.SpringBootBasicsKotlin.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(@Autowired private val studentService: StudentService) {
    @GetMapping("/students")
    fun getAllStudents(): List<Student> = studentService.getAllStudents();

    @PostMapping("/postStudent")
    fun saveStudentEntry(@RequestBody student: Student): Student = studentService.saveStudent(student)
}