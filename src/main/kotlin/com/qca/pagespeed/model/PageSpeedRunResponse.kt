package com.qca.pagespeed.model

import com.qca.pagespeed.model.apiResult.LightHouseResult
import com.qca.pagespeed.model.apiResult.LoadingExperience
import com.qca.pagespeed.model.apiResult.Version

data class PageSpeedRunResponse(
    val captchaResult: String,
    val kind: String,
    val id: String,
    val loadingExperience: LoadingExperience,
    val version: Version?,
    val originLoadingExperience: LoadingExperience,
    val analysisUTCTimestamp: String,
    val lighthouseResult: LightHouseResult,
)
