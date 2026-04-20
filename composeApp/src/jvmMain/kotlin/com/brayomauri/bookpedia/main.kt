package com.brayomauri.bookpedia

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.brayomauri.bookpedia.di.initKoin
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.logging.LoggingFormat
import org.koin.core.context.startKoin

fun main() {
    application {
        initKoin()
        Window(
            onCloseRequest = ::exitApplication,
            title = "KotlinProject",
        ) {
            App()
        }
    }
}