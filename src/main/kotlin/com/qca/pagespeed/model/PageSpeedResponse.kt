package com.qca.pagespeed.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.qca.pagespeed.model.apiResult.LightHouseResult
import com.qca.pagespeed.model.apiResult.LoadingExperience
import com.qca.pagespeed.model.apiResult.Version
import java.time.LocalDateTime

data class PageSpeedResponse(
    val seq: Long?,
    val captchaResult: String,
    val kind: String,
    val id: String,
    val loadingExperience: LoadingExperience,
    val version: Version?,
    val originLoadingExperience: LoadingExperience,
    @JsonProperty("analysisUTCTimestamp")
    val analysisUtcTimeStamp: LocalDateTime,
    val lighthouseResult: LightHouseResult,
)
