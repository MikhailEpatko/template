package ru.epatko.template.model

import jakarta.validation.constraints.NotBlank

data class CreateNullableRequest(

    @field:NotBlank(message = "Не может быть пустым")
    val name: String? = null,
)