package com.example.deepspaceserver.rest

import com.example.deepspaceserver.model.Message
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Api("Этот контроллер будет удалён, скорее всего. Для теста")
class DataApiController {

    @GetMapping("/api")
    @ApiOperation("Тест, в последствии будет удалён")
    fun test(): List<Message> = listOf(
        Message("Vladimir", 1256, "How are yo today?"),
        Message("Gleb", 8900, "Another message"),
        Message("Anon #2", 6543, "Im not real!"),
    )
}
