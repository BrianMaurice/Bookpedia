package com.brayomauri.bookpedia

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import coil3.ImageLoader
import coil3.compose.setSingletonImageLoaderFactory
import coil3.network.ktor3.KtorNetworkFetcherFactory
import com.brayomauri.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.brayomauri.bookpedia.book.data.repository.DefaultBookRepository
import com.brayomauri.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.brayomauri.bookpedia.book.presentation.book_list.BookListViewModel
import com.brayomauri.bookpedia.core.domain.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {

    val viewModel = koinViewModel<BookListViewModel>()
    // Initialize Coil to support network images
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context)
            .components {
                add(KtorNetworkFetcherFactory())
            }
            .build()
    }

    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {
            // Handle book click
        }
    )
}
