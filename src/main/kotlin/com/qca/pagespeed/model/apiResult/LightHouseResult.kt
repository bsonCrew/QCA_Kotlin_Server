package com.qca.pagespeed.model.apiResult

data class LightHouseResult(
    val requestedUrl: String,
    val finalUrl: String,
    val lighthouseVersion: String,
    val userAgent: String,
    val fetchTime: String,
    val environment: Environment,
    val runWarnings: List<String>,
    val configSettings: ConfigSetting,
    val audits: Map<String, Audit>,
    val categories: Map<String, Category>,
    val categoryGroups: Map<String, CategoryGroup>,
    val runtimeError: RuntimeError?,
    val timing: Timing,
    val i18n: I18n,
)
