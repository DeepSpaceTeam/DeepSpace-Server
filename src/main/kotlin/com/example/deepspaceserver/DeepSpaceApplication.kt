package com.example.deepspaceserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DeepSpaceApplication

fun main(args: Array<String>) {
    runApplication<DeepSpaceApplication>(*args)
}