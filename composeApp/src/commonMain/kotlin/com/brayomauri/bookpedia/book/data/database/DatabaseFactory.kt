package com.brayomauri.bookpedia.book.data.database

import androidx.room.RoomDatabase
import kotlin.reflect.KClass

expect class DatabaseFactory {
    fun create(): RoomDatabase.Builder<FavoriteBookDatabase>
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect fun KClass<FavoriteBookDatabase>.instantiateImpl(): FavoriteBookDatabase
