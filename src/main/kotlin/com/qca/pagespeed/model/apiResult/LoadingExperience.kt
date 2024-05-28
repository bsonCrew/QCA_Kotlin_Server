package com.qca.pagespeed.model.apiResult

import com.fasterxml.jackson.annotation.JsonProperty

data class LoadingExperience(
    val id: String,
    val metrics: Map<String, MetricDetail>,
    @JsonProperty("overall_category")
    val overallCategory: String,
    @JsonProperty("initial_url")
    val initialUrl: String,
)
