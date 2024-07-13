package com.qca.pagespeed.mapper

import com.qca.pagespeed.model.PageSpeedRequest
import org.apache.ibatis.annotations.Mapper

@Mapper
interface PageSpeedRequestHistoryMapper {
    fun insertPageSpeedRequestHistory(request: PageSpeedRequest)
}
