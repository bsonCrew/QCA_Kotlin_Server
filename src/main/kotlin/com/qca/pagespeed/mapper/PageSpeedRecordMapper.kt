package com.qca.pagespeed.mapper

import com.qca.pagespeed.model.PageSpeedResponse
import org.apache.ibatis.annotations.Mapper

@Mapper
interface PageSpeedRecordMapper {
    fun insertPageSpeedRecord(record: PageSpeedResponse): Long
}
