package io.czar.samples

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
	val app = SpringApplication.run(Application::class.java, *args)
	LoggerFactory.getLogger("Application").info("meow")
}

@SpringBootApplication
class Application