package com.brayomauri.bookpedia.book.presentation.book_detail

import com.brayomauri.bookpedia.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class OnSelectedBookChange(val book: Book) : BookDetailAction
}