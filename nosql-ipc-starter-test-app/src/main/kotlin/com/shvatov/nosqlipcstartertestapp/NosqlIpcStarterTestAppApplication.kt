package com.shvatov.nosqlipcstartertestapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NosqlIpcStarterTestAppApplication

fun main(args: Array<String>) {
    runApplication<NosqlIpcStarterTestAppApplication>(*args)
}
