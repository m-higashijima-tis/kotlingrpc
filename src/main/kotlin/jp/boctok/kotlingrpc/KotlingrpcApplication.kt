package jp.boctok.kotlingrpc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlingrpcApplication

fun main(args: Array<String>) {
	runApplication<KotlingrpcApplication>(*args)
}
