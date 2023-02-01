package com.example.cryptoapp.data.mapper

import com.example.cryptoapp.data.remote.dto.CryptoCurrency
import com.example.cryptoapp.domain.model.Cryptocurrency
import com.example.cryptoapp.domain.model.Portfolio
import com.example.cryptoapp.domain.model.Watchlist
import cryptoapp.cryptodb.PortfolioEntity
import cryptoapp.cryptodb.WatchlistEntity
import java.time.LocalDateTime

fun PortfolioEntity.toPortfolio(): Portfolio {
    return Portfolio(
        name = name,
        symbol = symbol,
        price = price,
        date = date,
        desc = desc
    )
}

fun Portfolio.toPortfolioEntity(): PortfolioEntity {
    return PortfolioEntity(
        id = 0,
        name = name,
        symbol = symbol,
        price = price,
        date = date,
        desc = desc
    )
}

fun WatchlistEntity.toPortfolio(): Watchlist {
    return Watchlist(
        name = name,
        symbol = symbol
    )
}

fun Watchlist.toPortfolioEntity(): WatchlistEntity {
    return WatchlistEntity(
        name = name,
        symbol = symbol
    )
}


fun CryptoCurrency.toCryptocurrencies(): Cryptocurrency {
    return Cryptocurrency(
        name = name,
        symbol = symbol,
        circulatingSupply = circulatingSupply,
        isActive = isActive,
        lastUpdated = lastUpdated,
        dateAdded = dateAdded,
        price = quotes[0].price,
        percentChange1h = quotes[0].percentChange1h,
        percentChange24h = quotes[0].percentChange24h,
        percentChange30d = quotes[0].percentChange30d,
        percentChange60d = quotes[0].percentChange60d,
        percentChange7d = quotes[0].percentChange7d,
        percentChange90d = quotes[0].percentChange90d,
        marketCap = quotes[0].marketCap,
        timestamp = LocalDateTime.now().toString()
    )
}