package com.example.cryptoapp.domain.model

data class Portfolio(
    val name: String,
    val symbol: String,
    val price: Double,
    val date: String,
    val desc: String?
)
