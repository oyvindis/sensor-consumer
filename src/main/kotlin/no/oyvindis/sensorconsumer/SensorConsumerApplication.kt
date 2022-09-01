package no.oyvindis.sensorconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SensorConsumerApplication

fun main(args: Array<String>) {
	runApplication<SensorConsumerApplication>(*args)
}
