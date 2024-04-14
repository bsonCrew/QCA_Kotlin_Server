package com.qca.pagespeed.model.apiResult

data class Audit(
    val id: String,
    val title: String?,
    val description: String?,
    val score: Double?,
    val scoreDisplayMode: String?,
    val displayValue: String?,
    val explanation: String?,
    val errorMessage: String?,
    val warnings: List<String>?,
    val numericValue: Double?,
    val numericUnit: String?,
    val details: Map<String, Any>?,
)
