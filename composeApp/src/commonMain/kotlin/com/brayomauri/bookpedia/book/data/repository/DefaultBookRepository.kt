package com.brayomauri.bookpedia.book.data.repository

import com.brayomauri.bookpedia.book.data.mappers.toBook
import com.brayomauri.bookpedia.book.data.network.RemoteBookDataSource
import com.brayomauri.bookpedia.book.domain.Book
import com.brayomauri.bookpedia.book.domain.BookRepository
import com.brayomauri.bookpedia.core.domain.DataError
import com.brayomauri.bookpedia.core.domain.Result
import com.brayomauri.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
): BookRepository {
    override suspend fun searchBooks(
        query: String
    ): Result<List<Book>, DataError.Remote>{
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}