package com.webdevj.kotlinApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinApiApplication>(*args)
	println("Tomcat initialized with port(s): 9000 (http), http://localhost:9000")
}
