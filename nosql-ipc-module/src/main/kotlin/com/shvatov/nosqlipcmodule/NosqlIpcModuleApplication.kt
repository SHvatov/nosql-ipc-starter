package com.shvatov.nosqlipcmodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NosqlIpcModuleApplication

fun main(args: Array<String>) {
    runApplication<NosqlIpcModuleApplication>(*args)
}
