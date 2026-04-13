package com.brayomauri.bookpedia.book.data.mappers

import com.brayomauri.bookpedia.book.data.dto.SearchedBookDto
import com.brayomauri.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id,
        title = title,
        imageUrl = if (coverKey != null) "https://covers.openlibrary.org/b/id/${coverKey}-M.jpg"
        else "https://covers.openlibrary.org/b/id/${coverKey}-M.jpg",
        //),
        authors = authorNames ?: emptyList(),
        description = description,
        languages = languages ?: emptyList(),
        firstPublishedYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingCount,
        numPages = numPages,
        numEditions = numEditions ?: 0
    )
}

fun List<SearchedBookDto>.toBookList(): List<Book> {
    return map { it.toBook() }
}