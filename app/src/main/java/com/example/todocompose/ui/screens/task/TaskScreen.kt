package com.example.todocompose.ui.screens.task

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.example.todocompose.data.models.Priority
import com.example.todocompose.data.models.ToDoTask
import com.example.todocompose.ui.viewmodels.SharedViewModel
import com.example.todocompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        }
    ) { innerPadding ->
        TaskContent(
            paddingValues = innerPadding,
            title = title,
            onTitleChange = {
                sharedViewModel.title.value = it
            },
            description = description,
            onDescriptionChange = {
                sharedViewModel.description.value = it
            },
            priority = priority,
            onPrioritySelected = {
                sharedViewModel.priority.value = it
            }
        )
    }
}
