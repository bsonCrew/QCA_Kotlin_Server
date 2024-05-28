package com.qca.pagespeed.model.apiResult

data class AuditRef(
    val id: String?,
    val weight: Double?,
    val group: String?,
    val acronym: String?,
    val relevantAudits: List<String>?,
)
