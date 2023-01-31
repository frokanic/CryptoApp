package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.remote.dto.CryptocurrenciesDto

interface CryptoApi {

    suspend fun getCryptoData(): List<CryptocurrenciesDto>

}