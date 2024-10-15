package com.example.todocompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF370083)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val LightGray = Color(0xFFFCFCFC)
val Teal200 = Color(0xFF03DAC5)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0XFFFF4646)
val NonePriorityColor = MediumGray

val ColorScheme.splashScreenBackground: Color
    @Composable
    // isSystemInDarkTheme이 Preview에선 제대로 작동하지 않음.
    get() = if (this == LightColorScheme) Purple700 else Color.Black

val ColorScheme.taskItemTextColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.DarkGray else LightGray

val ColorScheme.taskItemBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.White else DarkGray

val ColorScheme.fabBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Teal200 else Purple700

val ColorScheme.topAppBarContentColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.White else LightGray

val ColorScheme.topAppBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Purple500 else Color.Black
