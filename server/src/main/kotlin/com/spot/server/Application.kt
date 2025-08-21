package com.spot.server

import com.spot.database.databaseModule
import com.spot.server.core.coreModule
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    coreModule()

    databaseModule()
}