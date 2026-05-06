package com.brayomauri.bookpedia.book.domain

import com.brayomauri.bookpedia.core.domain.DataError
import com.brayomauri.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>
}