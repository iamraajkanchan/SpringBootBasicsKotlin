package com.chinky.tutorial.SpringBootBasicsKotlin.service

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Family
import com.chinky.tutorial.SpringBootBasicsKotlin.repository.FamilyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FamilyService(@Autowired private val familyRepository: FamilyRepository) {
    fun getAllFamilies(): List<Family> = familyRepository.findAll()
    fun saveFamily(family: Family) : Family = familyRepository.save(family)
}