package com.example.cryptoapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Status(
    val credit_count: Int,
    val elapsed: String,
    val error_code: String,
    val error_message: String,
    val timestamp: String
)