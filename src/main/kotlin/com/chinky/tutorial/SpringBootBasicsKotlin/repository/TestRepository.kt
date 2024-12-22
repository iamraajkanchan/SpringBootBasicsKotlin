package com.chinky.tutorial.SpringBootBasicsKotlin.repository

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<TestEntity, Long> {
}