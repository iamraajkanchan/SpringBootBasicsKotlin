package com.chinky.tutorial.SpringBootBasicsKotlin.service

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import com.chinky.tutorial.SpringBootBasicsKotlin.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService(@Autowired private val studentRepository: StudentRepository) {
    fun getAllStudents(): List<Student> = studentRepository.findAll()
    fun saveStudent(student: Student): Student = studentRepository.save(student)
}