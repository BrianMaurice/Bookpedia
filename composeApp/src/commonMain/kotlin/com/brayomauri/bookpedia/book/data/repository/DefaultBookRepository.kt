package com.brayomauri.bookpedia.book.data.repository

import com.brayomauri.bookpedia.book.data.network.RemoteBookDataSource
import com.brayomauri.bookpedia.book.domain.Book
import com.brayomauri.bookpedia.core.domain.DataError
import com.brayomauri.bookpedia.core.domain.Result

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
) {
    suspend fun searchBooks(
        query: String
    ): Result<List<Book>, DataError.Remote>{
        return remoteBookDataSource.searchBooks(query)
    }
}