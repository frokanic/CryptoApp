package com.example.cryptoapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class CryptocurrenciesDto(
    val `data`: Data,
    val status: Status
)