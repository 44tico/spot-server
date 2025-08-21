package com.spot.server.core

import io.ktor.server.application.Application

fun Application.coreModule() {
    configureContentNegotiation()
}