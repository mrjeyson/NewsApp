package com.example.newsapp.di

import com.example.newsapp.data.remote.apis.NewsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun newsApi(retrofit: Retrofit): NewsApi = retrofit.create(NewsApi::class.java)

}