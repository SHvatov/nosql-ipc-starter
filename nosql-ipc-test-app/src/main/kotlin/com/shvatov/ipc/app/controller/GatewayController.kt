package com.shvatov.ipc.app.controller

import com.shvatov.ipc.app.dto.Response
import com.shvatov.ipc.app.dto.ResponseCode
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/api")
class GatewayController {

    @PostMapping("{uri}")
    fun processRequest(
        @PathVariable("uri") uri: String,
        @RequestBody payload: Map<String, Any>
    ): Mono<Response> {
        return Mono.just(Response(UUID.randomUUID(), ResponseCode.SUCCESS))
    }
}