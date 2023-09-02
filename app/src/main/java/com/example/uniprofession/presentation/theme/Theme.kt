package com.example.uniprofession.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun UniProfessionTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        UniProfessionColorScheme provides uniProfessionTheme
    ) {
        content()
    }
}

object UniProfessionTheme {
    val colors: ColorScheme
        @Composable
        get() = UniProfessionColorScheme.current
}