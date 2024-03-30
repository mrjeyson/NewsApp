package com.example.newsapp.presentaion.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.newsapp.presentaion.bookmark.BookmarkScreen
import com.example.newsapp.presentaion.bookmark.BookmarkViewModel
import com.example.newsapp.presentaion.home.HomeScreen
import com.example.newsapp.presentaion.home.HomeViewModel
import com.example.newsapp.presentaion.home.news_navigator.NewsNavigator
import com.example.newsapp.presentaion.onboarding.OnBoardingScreen
import com.example.newsapp.presentaion.onboarding.OnBoardingViewModel
import com.example.newsapp.presentaion.search.SearchScreen
import com.example.newsapp.presentaion.search.SearchViewModel

@Composable
fun NavGraph(
    startDestination: String
) {


    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(
                route = Route.OnBoardingScreen.route
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ) {
            composable(route = Route.NewsNavigatorScreen.route) {
                NewsNavigator()
            }
        }
    }


}