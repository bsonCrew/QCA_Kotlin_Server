package com.qca.pagespeed.model.apiResult

data class Environment(
    val networkUserAgent: String,
    val hostUserAgent: String,
    val benchmarkIndex: Double,
)
