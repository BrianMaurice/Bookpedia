package com.brayomauri.bookpedia.app

import kotlinx.serialization.Serializable
import kotlin.reflect.KClass

sealed interface Route {
    @Serializable
    data object BookGraph: Route
    @Serializable
    data object BookList: Route
    @Serializable
    data class BookDetail(val id: String): Route
}