package com.example.newsapp.presentaion.bookmark

import com.example.newsapp.domain.model.Article

data class BookmarkState(
    val articles: List<Article> = emptyList()
)