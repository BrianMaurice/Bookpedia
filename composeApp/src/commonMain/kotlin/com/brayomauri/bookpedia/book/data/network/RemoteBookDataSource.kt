package com.brayomauri.bookpedia.book.data.network

import com.brayomauri.bookpedia.book.data.dto.SearchResponseDto
import com.brayomauri.bookpedia.core.domain.DataError
import com.brayomauri.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int?=null
    ): Result<SearchResponseDto, DataError.Remote>
}