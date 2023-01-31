package com.example.cryptoapp.data.local

import crypto_app.cryptodb.PortfolioEntity
import kotlinx.coroutines.flow.Flow

interface PortfolioDataSource {

    fun getAllPortfolio(): Flow<List<PortfolioEntity>>

    suspend fun insertToPortfolio(
        id: Int? = null,
        name: String,
        symbol: String,
        price: Long,
        date: String,
        desc: String? = null
    )

    suspend fun deleteFromPortfolioByName(name: String)


}