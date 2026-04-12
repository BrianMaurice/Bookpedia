package com.brayomauri.bookpedia.book.presentation.book_list

import com.brayomauri.bookpedia.book.domain.Book
import com.brayomauri.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        languages = emptyList(),
        averageRating = 4.67854,
        numPages = 100,
        firstPublishedYear = "",
        ratingCount = 100,
        numEditions = 3
    )
}