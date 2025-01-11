package com.chinky.tutorial.SpringBootBasicsKotlin.repository

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>