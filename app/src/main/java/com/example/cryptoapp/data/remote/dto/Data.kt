package com.example.cryptoapp.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class Data(
    val cryptoCurrencyList: List<CryptoCurrency>,
    val totalCount: String
)