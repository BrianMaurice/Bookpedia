package com.brayomauri.bookpedia

import android.app.Application
import com.brayomauri.bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class BookApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@BookApplication)
        }
    }
}
