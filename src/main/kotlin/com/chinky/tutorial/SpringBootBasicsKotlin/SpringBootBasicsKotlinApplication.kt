package com.chinky.tutorial.SpringBootBasicsKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * To run the project, use the following command in terminal
 * ./gradlew bootRun
 *  In case it is not working you can use the below commands
 *  ./gradlew --version
 *  ./gradlew clean build
 * */

@SpringBootApplication
class SpringBootBasicsKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringBootBasicsKotlinApplication>(*args)
}
