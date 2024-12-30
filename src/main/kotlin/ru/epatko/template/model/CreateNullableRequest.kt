package ru.epatko.template.model

import jakarta.validation.constraints.NotBlank

data class CreateNullableRequest(

    @field:NotBlank(message = "May not be blank")
    val name: String? = null,
)