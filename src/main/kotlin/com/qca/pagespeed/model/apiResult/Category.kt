package com.qca.pagespeed.model.apiResult

data class Category(
    val id: String?,
    val title: String?,
    val description: String?,
    val score: Double?,
    val manualDescription: String?,
    val auditRefs: List<AuditRef>,
)
