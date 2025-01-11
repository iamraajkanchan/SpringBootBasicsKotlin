package com.chinky.tutorial.SpringBootBasicsKotlin.repository

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Student
import org.springframework.data.repository.PagingAndSortingRepository

interface StudentPagingRepository : PagingAndSortingRepository<Student, Long>