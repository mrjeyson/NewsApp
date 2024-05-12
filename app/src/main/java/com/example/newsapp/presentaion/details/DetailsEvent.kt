package com.example.newsapp.presentaion.details

import com.example.newsapp.domain.model.Article

sealed class DetailsEvent {

    data class UpsertDeleteArticle(val article: Article) : DetailsEvent()
    data object RemoveSideEffect : DetailsEvent()
}