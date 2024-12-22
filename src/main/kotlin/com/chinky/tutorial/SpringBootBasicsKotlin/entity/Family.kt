package com.chinky.tutorial.SpringBootBasicsKotlin.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Date

@Entity
@Table(name = "family")
data class Family(
    @Id @Column(name = "id") val id: Long = 0,
    @Column(name = "name") val name: String = "",
    @Column(name = "address") val address: String = "",
    @Column(name = "date_of_birth") val dateOfBirth: Date = Date.valueOf("1970-01-01"),
    @Column(name = "age") val age: Int = 0
) {
    constructor() : this(0, "", "", Date.valueOf("1970-01-01"), 0)
}