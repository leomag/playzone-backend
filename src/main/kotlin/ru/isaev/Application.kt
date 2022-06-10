package ru.isaev

import configurationSerialization
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import ru.isaev.features.login.configureLoginRouting
import ru.isaev.features.register.configureRegisterRouting
import ru.isaev.plugins.*

fun main() {
    embeddedServer(CIO, port = 8180, host = "0.0.0.0") {
        configureRouting()
        configureLoginRouting()
        configureRegisterRouting()
        configurationSerialization()
    }.start(wait = true)
}
