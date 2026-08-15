package com.example.movieapp.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.DetailsScreen
import com.example.movieapp.screens.HomeScreen

@Composable
fun MovieNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(
            route = Screen.Home.route,
            exitTransition = { fadeOut(animationSpec = tween(300)) },
            popEnterTransition = { fadeIn(animationSpec = tween(300)) }
        ) {
            HomeScreen(onMovieClick = { movieId ->
                navController.navigate(Screen.Details.createRoute(movieId))
            })
        }

        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument("movieId") { type = NavType.IntType }),
            enterTransition = {
                slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(350)) +
                        fadeIn(animationSpec = tween(350))
            },
            popExitTransition = {
                slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(300)) +
                        fadeOut(animationSpec = tween(300))
            }
        ) { backStackEntry ->
            val movieId = backStackEntry.arguments?.getInt("movieId") ?: return@composable
            DetailsScreen(movieId = movieId, onBackClick = { navController.popBackStack() })
        }
    }
}