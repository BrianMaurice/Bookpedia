package com.brayomauri.bookpedia.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.brayomauri.bookpedia.book.data.database.DatabaseFactory
import com.brayomauri.bookpedia.book.data.database.FavoriteBookDatabase
import com.brayomauri.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.brayomauri.bookpedia.book.data.network.RemoteBookDataSource
import com.brayomauri.bookpedia.book.data.repository.DefaultBookRepository
import com.brayomauri.bookpedia.book.domain.BookRepository
import com.brayomauri.bookpedia.book.presentation.SelectedBookViewModel
import com.brayomauri.bookpedia.book.presentation.book_detail.BookDetailViewModel
import com.brayomauri.bookpedia.book.presentation.book_list.BookListViewModel
import com.brayomauri.bookpedia.core.domain.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)

}