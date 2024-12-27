package ru.epatko.template.controller

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.epatko.template.model.CreateNonNullableRequest
import ru.epatko.template.model.CreateNullableRequest

@RestController
class TemplateController {

    @PostMapping("/nullable")
    fun createNullable(
        @Valid @RequestBody request: CreateNullableRequest,
    ): String = "Hello, nullable World!"

    @PostMapping("/non-nullable")
    fun createNonNullable(
        @Valid @RequestBody request: CreateNonNullableRequest,
    ): String = "Hello, non nullable World!"
}