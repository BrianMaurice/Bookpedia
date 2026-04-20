package com.brayomauri.bookpedia.core.presentation

import com.brayomauri.bookpedia.core.domain.DataError
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.error_disk_full
import kotlinproject.composeapp.generated.resources.error_no_internet
import kotlinproject.composeapp.generated.resources.error_request_timeout
import kotlinproject.composeapp.generated.resources.error_serialization
import kotlinproject.composeapp.generated.resources.error_too_many_requests
import kotlinproject.composeapp.generated.resources.error_unknown

fun DataError.toUiText(): UiText {
     val stringRes = when(this) {
        DataError.Local.DISK_FULL -> Res.string.error_disk_full
        DataError.Local.UNKNOWN -> Res.string.error_unknown
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_request_timeout
        DataError.Remote.UNKNOWN -> Res.string.error_unknown
        DataError.Remote.NO_INTERNET -> Res.string.error_no_internet
        DataError.Remote.TOO_MANY_REQUESTS -> Res.string.error_too_many_requests
        DataError.Remote.SERVER -> Res.string.error_unknown
        DataError.Remote.SERIALIZATION -> Res.string.error_serialization
    }
    return UiText.StringResourceId(stringRes)
}