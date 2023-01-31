package com.example.cryptoapp.data.local

import com.example.sqldelightcryptoapp.CryptoDatabase
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import crypto_app.cryptodb.PortfolioEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class PortfolioDataSourceImpl(
    db: CryptoDatabase
): PortfolioDataSource {

    private val queries = db.portfolioEntityQueries

    override fun getAllPortfolio(): Flow<List<PortfolioEntity>> {
        return queries.getAllPortfolio().asFlow().mapToList()
    }

    override suspend fun insertToPortfolio(
        id: Int?,
        name: String,
        symbol: String,
        price: Long,
        date: String,
        desc: String?
    ) {
        withContext(Dispatchers.IO) {
            queries.insertToPortfolio(
                id = id,
                name = name,
                symbol = symbol,
                price = price.toDouble(),
                date = date,
                desc = desc
            )
        }
    }

    override suspend fun deleteFromPortfolioByName(name: String) {
        withContext(Dispatchers.IO) {
            queries.deleteFromPortfolioByName(name)
        }
    }
}