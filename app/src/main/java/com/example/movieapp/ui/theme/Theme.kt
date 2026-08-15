package com.example.movieapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val MovieDarkColorScheme = darkColorScheme(
    primary = Teal400,
    secondary = Gold400,
    background = Navy900,
    surface = Navy800,
    onPrimary = Navy900,
    onSecondary = Navy900,
    onBackground = CreamWhite,
    onSurface = CreamWhite
)

@Composable
fun MovieAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MovieDarkColorScheme,
        typography = AppTypography,
        content = content
    )
}