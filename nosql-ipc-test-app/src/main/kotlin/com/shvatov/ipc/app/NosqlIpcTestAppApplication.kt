package com.shvatov.ipc.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NosqlIpcTestAppApplication

fun main(args: Array<String>) {
    runApplication<NosqlIpcTestAppApplication>(*args)
}
