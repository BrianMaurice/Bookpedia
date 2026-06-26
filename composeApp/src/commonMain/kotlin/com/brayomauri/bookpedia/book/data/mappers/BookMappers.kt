package com.brayomauri.bookpedia.book.data.mappers

import com.brayomauri.bookpedia.book.data.database.BookEntity
import com.brayomauri.bookpedia.book.data.dto.SearchedBookDto
import com.brayomauri.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if (coverKey != null) "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        else "https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg",
        //),
        authors = authorNames ?: emptyList(),
        description = null,
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

fun Book.toBookEntity(): BookEntity {
    return BookEntity(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl,
        languages = languages,
        authors = authors,
        firstPublishYear = firstPublishedYear,
        ratingsAverage = averageRating,
        ratingCount = ratingCount,
        numPagesMedian = numPages,
        numEditions = numEditions
    )
}

fun BookEntity.toBook(): Book {
    return Book(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl,
        languages = languages,
        authors = authors,
        firstPublishedYear =  firstPublishYear,
        averageRating = ratingsAverage,
        ratingCount = ratingCount,
        numPages = numPagesMedian,
        numEditions = numEditions
    )
}