package com.chinky.tutorial.SpringBootBasicsKotlin.controller

import com.chinky.tutorial.SpringBootBasicsKotlin.entity.Family
import com.chinky.tutorial.SpringBootBasicsKotlin.service.FamilyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FamilyController(@Autowired private val familyService: FamilyService) {

    @GetMapping("/families")
    fun getAllFamilies(): List<Family> = familyService.getAllFamilies();

    @PostMapping("/postFamily")
    fun saveFamilyEntry(@RequestBody family: Family): Family = familyService.saveFamily(family)
}