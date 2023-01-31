package com.example.cryptoapp.data.local

import cryptoapp.cryptodb.PortfolioEntity
import kotlinx.coroutines.flow.Flow

interface PortfolioDataSource {

    fun getAllPortfolio(): Flow<List<PortfolioEntity>>

    suspend fun insertToPortfolio(
        id: Long?,
        name: String,
        symbol: String,
        price: Long,
        date: String,
        desc: String? = null
    )

    suspend fun deleteFromPortfolioByName(name: String)


}