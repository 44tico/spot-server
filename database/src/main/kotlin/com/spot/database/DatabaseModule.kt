package com.spot.database

import com.spot.database.core.configurePostgres
import io.ktor.server.application.Application

fun Application.databaseModule() {
    configurePostgres()
}