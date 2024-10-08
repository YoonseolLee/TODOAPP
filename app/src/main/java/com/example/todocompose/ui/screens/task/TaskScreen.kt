package com.example.todocompose.ui.screens.task

import android.content.Context
import android.widget.Toast
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
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

    val context = LocalContext.current

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = { action ->
                    // 닫기 또는 뒤로가기 화살표 누른 경우에는 검증할 필요 없이 뒤로가기
                    if (action == Action.NO_ACTION) {
                        navigateToListScreen(action)
                    } else {
                        if (sharedViewModel.validateFields()) {
                            navigateToListScreen(action)
                        } else {
                            displayToast(context = context)

                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        TaskContent(
            paddingValues = innerPadding,
            title = title,
            onTitleChange = {
                sharedViewModel.updateTitle(it)
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

fun displayToast(context: Context) {
    Toast.makeText(
        context,
        "Fields Empty.",
        Toast.LENGTH_SHORT
    ).show()
}
