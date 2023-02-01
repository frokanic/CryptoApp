package com.example.cryptoapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class AuditInfo(
    val auditStatus: Int,
    val auditTime: String,
    val auditor: String,
    val coinId: String,
    val contractAddress: String,
    val contractPlatform: String,
    val reportUrl: String,
    val score: String
)


