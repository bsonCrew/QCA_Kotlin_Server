package com.qca.pagespeed.service

import com.qca.pagespeed.api.PageSpeedApi
import com.qca.pagespeed.mapper.PageSpeedRecordMapper
import com.qca.pagespeed.mapper.PageSpeedRequestHistoryMapper
import com.qca.pagespeed.model.PageSpeedRequest
import com.qca.pagespeed.model.PageSpeedResponse
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val LOGGER = KotlinLogging.logger {}

@Service
class PageSpeedService(
    private val pageSpeedApi: PageSpeedApi,
    private val pageSpeedRequestHistoryMapper: PageSpeedRequestHistoryMapper,
    private val pageSpeedRecordMapper: PageSpeedRecordMapper,
) {
    fun runPageSpeed(request: PageSpeedRequest): PageSpeedResponse? {
        LOGGER.info { "[runPageSpeed] request : $request" }

        val response = pageSpeedApi.callPageSpeedApi(request)

        LOGGER.info { "[runPageSpeed] api response : $response" }

        pageSpeedRequestHistoryMapper.insertPageSpeedRequestHistory(request)

        if (response != null) {
            pageSpeedRecordMapper.insertPageSpeedRecord(response)
        }

        return response
    }
}
