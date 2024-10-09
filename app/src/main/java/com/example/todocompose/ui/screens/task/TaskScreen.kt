package com.example.todocompose.ui.screens.task

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TaskScreen() {
    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = { /* Handle Action */ })
        },
        content = { paddingValues ->
            // paddingValues를 content에 전달합니다.
            Box(modifier = Modifier.padding(paddingValues)) {
                // 실제 UI 요소를 이곳에 넣습니다.
            }
        }
    )
}
