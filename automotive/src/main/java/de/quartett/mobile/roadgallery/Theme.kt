package com.example.jetpackcomposeexample.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

// Define your color palette
private val LightColors = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC6),
    background = Color(0xFFF5F5F5),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun RoadGalleryTheme(
    content: @Composable () -> Unit
) {
    // Apply the theme using MaterialTheme and pass in colors, typography, etc.
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography(
            displayLarge = TextStyle(
                fontSize = 30.sp,
                color = Color.Black
            ),
            displayMedium = TextStyle(
                fontSize = 24.sp,
                color = Color.Black
            ),
            displaySmall = TextStyle(
                fontSize = 16.sp,
                color = Color.Black
            )
        ),
        content = content
    )
}
