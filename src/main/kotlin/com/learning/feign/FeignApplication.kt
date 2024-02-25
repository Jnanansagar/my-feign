package com.learning.feign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignApplication

fun main(args: Array<String>) {
	runApplication<FeignApplication>(*args)
}
