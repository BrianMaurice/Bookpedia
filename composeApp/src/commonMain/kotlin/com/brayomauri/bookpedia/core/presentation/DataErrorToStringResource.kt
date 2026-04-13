package com.brayomauri.bookpedia.core.presentation

import com.brayomauri.bookpedia.core.domain.DataError

fun DataError.toUiText(): UiText {
     val stringRes = when(this) {
        DataError.Local.DISK_FULL -> TODO()
        DataError.Local.UNKNOWN -> TODO()
        DataError.Remote.REQUEST_TIMEOUT -> TODO()
        DataError.Remote.UNKNOWN -> TODO()
        DataError.Remote.NO_INTERNET -> TODO()
        DataError.Remote.TOO_MANY_REQUESTS -> TODO()
        DataError.Remote.SERVER -> TODO()
        DataError.Remote.SERIALIZATION -> TODO()
    }
}