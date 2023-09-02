package com.example.uniprofession.presentation.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val green = Color(0xFF9CF877)
val limeGreen = Color(0xFFDDFF9C)
val white = Color(0xFFE7E4F1)
val red = Color(0xFFFFA7B3)

val gradientLight = Color(0xFF303036)
val gradientMedium = Color(0xFF27272B)
val gradientDark = Color(0xFF131315)

@Immutable
data class ColorScheme(
    val green: Color,
    val limeGreen: Color,
    val white: Color,
    val red: Color,
    val gradientLight: Color,
    val gradientMedium: Color,
    val gradientDark: Color
)

val uniProfessionTheme: ColorScheme = ColorScheme(
    green = green,
    limeGreen = limeGreen,
    white = white,
    red = red,
    gradientLight = gradientLight,
    gradientMedium = gradientMedium,
    gradientDark = gradientDark
)

@SuppressLint("CompositionLocalNaming")
val UniProfessionColorScheme = staticCompositionLocalOf {
    uniProfessionTheme
}