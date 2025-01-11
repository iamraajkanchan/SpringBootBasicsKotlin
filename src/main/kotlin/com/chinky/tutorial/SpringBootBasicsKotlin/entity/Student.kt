package com.chinky.tutorial.SpringBootBasicsKotlin.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "student_table")

data class Student(
    @Id
    @Column(name = "unique_id")
    val unique_id: String,
    @Column(name = "sr_no") val srNo: Int,
    val name: String?,
    val gender: String?,
    val DOB: String?,
    val klass: String?,
    val father_name: String?,
    val mother_name: String?,
    val caste: String?,
    val category: String?,
    val institute: String?,
    val school_name: String?,
    val isPresent: Int,
    val Hindi_Unit: Int,
    val Math_Unit: Int,
    val Biodiversity_Unit: Int,
    val attendance_date: String?,
    val Hindi_Grade: String?,
    val Maths_Grade: String?,
    val Biodiversity_Grade: String?,
    val absent_reason: String?
) {
    constructor() : this(
        unique_id = "",
        srNo = 0,
        name = null,
        gender = null,
        DOB = null,
        klass = null,
        father_name = null,
        mother_name = null,
        caste = null,
        category = null,
        institute = null,
        school_name = null,
        isPresent = 0,
        Hindi_Unit = 0,
        Math_Unit = 0,
        Biodiversity_Unit = 0,
        attendance_date = null,
        Hindi_Grade = null,
        Maths_Grade = null,
        Biodiversity_Grade = null,
        absent_reason = null
    )
}
