package com.example.todocompose.ui.screens.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = { paddingValues ->
            // 임시로 빈 Box를 넣어둡니다.
            Box(modifier = Modifier.padding(paddingValues)) {}
        },
        floatingActionButton = {
            ListFab(navigateToTaskScreen = navigateToTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    navigateToTaskScreen: (Int) -> Unit
) {
    FloatingActionButton(
        onClick = {
            navigateToTaskScreen(-1) // 임시로 -1로 설정한거임! 추후 변경 예정
        }
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Button"
        )
    }
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(
        navigateToTaskScreen = {}
    )
}