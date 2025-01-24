package com.qca.pagespeed.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

data class PageSpeedRequest(
    @field:NotBlank
    val url: String,
    var category: String?,
    var locale: String?,
    @JsonProperty("utm_campaign")
    var utmCampaign: String?,
    @JsonProperty("utm_source")
    var utmSource: String?,
    var regDate: LocalDateTime?,
    var regUser: String?,
    var modDate: LocalDateTime?,
    var modUser: String?,
)
