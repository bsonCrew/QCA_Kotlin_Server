package com.qca.pagespeed.model.apiResult

data class ConfigSetting(
    val emulatedFormFactor: String,
    val formFactor: String,
    val locale: String,
    val onlyCategories: List<String>,
    val channel: String,
)
