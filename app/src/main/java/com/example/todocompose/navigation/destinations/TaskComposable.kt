package com.example.todocompose.navigation.destinations


import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todocompose.ui.screens.task.TaskScreen
import com.example.todocompose.util.Action
import com.example.todocompose.util.Constants.TASK_ARGUMENT_KEY
import com.example.todocompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN, // task/{taskId}
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        Log.d("TaskComposable", taskId.toString())

        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}