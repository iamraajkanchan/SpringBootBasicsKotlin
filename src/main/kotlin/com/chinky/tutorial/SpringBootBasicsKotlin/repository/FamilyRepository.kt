package com.chinky.tutorial.SpringBootBasicsKotlin.repository

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Family
import org.springframework.data.jpa.repository.JpaRepository

interface FamilyRepository : JpaRepository<Family, Long>