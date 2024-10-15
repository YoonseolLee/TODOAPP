package com.example.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.todocompose.ui.screens.splash.SplashScreen
import com.example.todocompose.util.Constants.LIST_SCREEN
import com.example.todocompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN
    ) { navBackStackEntry ->
        SplashScreen(navigateToListScreen = navigateToListScreen)

    }
}