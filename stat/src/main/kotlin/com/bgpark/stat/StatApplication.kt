package com.bgpark.stat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StatApplication

fun main(args: Array<String>) {
    runApplication<StatApplication>(*args)
    println("stat v4")
}
