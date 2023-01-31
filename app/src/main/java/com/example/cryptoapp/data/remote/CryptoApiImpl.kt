package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.remote.dto.CryptocurrenciesDto
import com.example.stockmarketapp.utils.Constants.ENDPOINT
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*

class CryptoApiImpl(
    private val client: HttpClient
): CryptoApi {

    override suspend fun getCryptoData(): List<CryptocurrenciesDto> {
        return try {
            client.get { url(ENDPOINT) }
        } catch(e: RedirectResponseException) {
            // 3xx - responses
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch(e: ClientRequestException) {
            // 4xx - responses
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch(e: ServerResponseException) {
            // 5xx - responses
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch(e: Exception) {
            println("Error: ${e.message}")
            emptyList()
        }
    }
}
