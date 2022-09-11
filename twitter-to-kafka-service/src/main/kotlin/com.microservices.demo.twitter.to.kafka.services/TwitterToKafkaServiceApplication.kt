package com.microservices.demo.twitter.to.kafka.services

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwitterToKafkaServiceApplication

fun main(args: Array<String>) {
    runApplication<TwitterToKafkaServiceApplication>(*args)
}
