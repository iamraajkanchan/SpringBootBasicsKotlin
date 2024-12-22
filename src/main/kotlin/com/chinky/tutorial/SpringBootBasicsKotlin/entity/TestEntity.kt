package com.chinky.tutorial.SpringBootBasicsKotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "testEntity")
data class TestEntity(@Id val id: Long, val name: String) {
    constructor() : this(0, "")
}
