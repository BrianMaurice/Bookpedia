package com.brayomauri.bookpedia


import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.brayomauri.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.brayomauri.bookpedia.book.presentation.book_list.BookListViewModel


@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }
    )
}