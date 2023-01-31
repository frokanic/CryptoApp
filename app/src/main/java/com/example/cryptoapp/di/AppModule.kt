package com.example.cryptoapp.di

import com.example.cryptoapp.data.local.PortfolioDataSource
import com.example.cryptoapp.data.local.PortfolioDataSourceImpl
import com.example.cryptoapp.data.local.WatchlistDataSource
import com.example.cryptoapp.data.local.WatchlistDataSourceImpl
import com.example.cryptoapp.data.remote.CryptoApi
import com.example.cryptoapp.data.remote.CryptoApiImpl
import com.example.sqldelightcryptoapp.CryptoDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import org.koin.dsl.module


val appModule = module {

    single {
        HttpClient(Android) {
            install(Logging) {
                level = LogLevel.ALL
            }
            install(JsonFeature) {
                serializer = KotlinxSerializer()
            }
        }
    }

    single {
        CryptoApiImpl(get()) as CryptoApi
    }

    single {
        AndroidSqliteDriver(
            schema = CryptoDatabase.Schema,
            context = get(),
            name = "crypto.db"
        )
    }

    single {
        PortfolioDataSourceImpl(CryptoDatabase(get())) as PortfolioDataSource
    }

    single {
        WatchlistDataSourceImpl(CryptoDatabase(get())) as WatchlistDataSource
    }

}

