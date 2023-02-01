package com.example.cryptoapp.domain.model

data class Cryptocurrency(
    val name: String,
    val symbol: String,
    val circulatingSupply : Double,
    val isActive: Int,
    val lastUpdated: String,
    val dateAdded: String,
    val price: Double,
    val percentChange1h: Double,
    val percentChange24h: Double,
    val percentChange30d: Double,
    val percentChange60d: Double,
    val percentChange7d: Double,
    val percentChange90d: Double,
    val marketCap: Double,
    val timestamp: String
)

