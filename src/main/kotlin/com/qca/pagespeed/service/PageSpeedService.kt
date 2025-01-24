package com.qca.pagespeed.service

import com.qca.pagespeed.api.PageSpeedApi
import com.qca.pagespeed.mapper.PageSpeedRecordMapper
import com.qca.pagespeed.mapper.PageSpeedRequestHistoryMapper
import com.qca.pagespeed.model.PageSpeedRequest
import com.qca.pagespeed.model.PageSpeedResponse
import org.springframework.stereotype.Service

@Service
class PageSpeedService(
    private val pageSpeedApi: PageSpeedApi,
    private val pageSpeedRequestHistoryMapper: PageSpeedRequestHistoryMapper,
    private val pageSpeedRecordMapper: PageSpeedRecordMapper,
) {
    fun runPageSpeed(request: PageSpeedRequest): PageSpeedResponse? {
        val response = pageSpeedApi.callPageSpeedApi(request)

        pageSpeedRequestHistoryMapper.insertPageSpeedRequestHistory(request)

        if (response != null) {
            pageSpeedRecordMapper.insertPageSpeedRecord(response)
        }

        return response
    }
}
