package com.qca.pagespeed.service

import com.qca.pagespeed.api.PageSpeedApi
import com.qca.pagespeed.model.PageSpeedRunRequest
import com.qca.pagespeed.model.PageSpeedRunResponse
import org.springframework.stereotype.Service

@Service
class PageSpeedService(
    private val pageSpeedApi: PageSpeedApi,
) {
    fun runPageSpeed(request: PageSpeedRunRequest): PageSpeedRunResponse? {
        return pageSpeedApi.callPageSpeedApi(request)
    }
}
