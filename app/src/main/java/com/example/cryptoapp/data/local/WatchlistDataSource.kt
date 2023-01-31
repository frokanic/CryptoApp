package com.example.cryptoapp.data.local

import crypto_app.cryptodb.WatchlistEntity
import kotlinx.coroutines.flow.Flow

interface WatchlistDataSource {

    fun getAllWatchlist(): Flow<List<WatchlistEntity>>

    suspend fun insertToWatchlist(name: String, symbol: String)

    suspend fun deleteFromWatchlistByName(name: String)


}