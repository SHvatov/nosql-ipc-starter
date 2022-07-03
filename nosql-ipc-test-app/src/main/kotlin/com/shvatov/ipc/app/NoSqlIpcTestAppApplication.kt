package com.shvatov.ipc.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NoSqlIpcTestAppApplication

fun main(args: Array<String>) {
    runApplication<NoSqlIpcTestAppApplication>(*args)
}
