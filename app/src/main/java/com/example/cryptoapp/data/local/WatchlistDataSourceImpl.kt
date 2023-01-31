package com.example.cryptoapp.data.local

import com.example.sqldelightcryptoapp.CryptoDatabase
import com.squareup.sqldelight.runtime.coroutines.asFlow
import com.squareup.sqldelight.runtime.coroutines.mapToList
import cryptoapp.cryptodb.WatchlistEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class WatchlistDataSourceImpl(
    db: CryptoDatabase
): WatchlistDataSource {

    private val queries = db.watchlistEntityQueries

    override fun getAllWatchlist(): Flow<List<WatchlistEntity>> {
        return queries.getAllWatchlist().asFlow().mapToList()
    }

    override suspend fun insertToWatchlist(name: String, symbol: String) {
        withContext(Dispatchers.IO) {
            queries.insertToWatchlist(name = name, symbol = symbol)
        }
    }

    override suspend fun deleteFromWatchlistByName(name: String) {
        withContext(Dispatchers.IO) {
            queries.deleteFromWatchlistByName(name)
        }
    }
}