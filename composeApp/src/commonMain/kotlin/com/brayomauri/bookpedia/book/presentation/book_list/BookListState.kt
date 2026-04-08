package com.brayomauri.bookpedia.book.presentation.book_list

import com.brayomauri.bookpedia.book.domain.Book

data class BookListState(
    val searchQuery: String = "Kotlin",
    val SearchResults: List<Book> = emptyList(),
    val favoriteBook: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0
)