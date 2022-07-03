@file:Suppress("unused")

package com.shvatov.ipc.app.dto

import java.util.*

data class Request(
    val traceId: UUID,
    val uri: String,
    val payload: Map<String, Any> = emptyMap()
)

enum class ResponseCode {
    SUCCESS, FAILURE, ERROR
}

data class Response(
    val traceId: UUID,
    val code: ResponseCode,
    val payload: Map<String, Any> = emptyMap()
)