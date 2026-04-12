package com.brayomauri.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.brayomauri.bookpedia.book.domain.Book
import com.brayomauri.bookpedia.book.presentation.book_list.BookListScreen
import com.brayomauri.bookpedia.book.presentation.book_list.BookListState
import com.brayomauri.bookpedia.book.presentation.book_list.books
import com.brayomauri.bookpedia.book.presentation.book_list.components.BookSearchBar


@Preview
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme{
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ){
            BookSearchBar(
                searchQuery = "",
                onSearchQueryChange = {},
                onImeSearch = {},
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

    }
}



@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}