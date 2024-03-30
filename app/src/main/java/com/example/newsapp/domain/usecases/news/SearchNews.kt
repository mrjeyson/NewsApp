package com.example.newsapp.domain.usecases.news

import com.example.newsapp.domain.repository.NewsRepository

class SearchNewsUseCase(
    private val newsRepository: NewsRepository
) {

}