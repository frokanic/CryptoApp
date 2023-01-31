package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.remote.dto.CryptocurrenciesDto
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*

interface CryptoApi {

    suspend fun getCryptoData(): List<CryptocurrenciesDto>

}