package com.chinky.tutorial.SpringBootBasicsKotlin.service

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import com.chinky.tutorial.SpringBootBasicsKotlin.repository.StudentPagingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class StudentPagingService(@Autowired private val studentRepository: StudentPagingRepository) {
    fun getStudentToAndFrom(page: Int, size: Int): Page<Student> {
        val pageable = PageRequest.of(page, size)
        return studentRepository.findAll(pageable)
    }
}