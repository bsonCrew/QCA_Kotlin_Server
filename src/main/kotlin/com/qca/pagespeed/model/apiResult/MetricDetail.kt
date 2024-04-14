package com.qca.pagespeed.model.apiResult

data class MetricDetail(
    val percentile: Int,
    val distributions: List<Distribution>,
    val category: String,
)
