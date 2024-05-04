package com.example.newsapp.presentaion.onboarding

sealed class OnBoardingEvent {

    data object SaveAppEntry : OnBoardingEvent()
}