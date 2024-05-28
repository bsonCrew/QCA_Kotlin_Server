package com.qca.pagespeed.model

import jakarta.validation.constraints.NotBlank

data class PageSpeedRunRequest(
    @field:NotBlank
    val url: String,
)
