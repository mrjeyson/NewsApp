package com.example.newsapp.di

import com.example.newsapp.data.local.dao.NewsDao
import com.example.newsapp.data.local.dao.NewsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    @Singleton
    fun getDataBase(): NewsDatabase = NewsDatabase.getDatabase()

    @Provides
    @Singleton
    fun getMessageModelDao(newsDatabase: NewsDatabase): NewsDao =
        newsDatabase.newsDao()

}