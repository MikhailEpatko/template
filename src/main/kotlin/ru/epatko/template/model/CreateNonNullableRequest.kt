package ru.epatko.template.model

import jakarta.validation.constraints.NotBlank

data class CreateNonNullableRequest(

    @field:NotBlank(message = "Поле name не может быть пустым")
    val name: String,
)