package com.example.uniprofession.presentation.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.uniprofession.R

data class Typography(
    val headlineBold: TextStyle,
    val headlineMedium: TextStyle,
    val headlineLight: TextStyle,
    val titleBold: TextStyle,
    val titleMedium: TextStyle,
    val titleLight: TextStyle,
    val labelBold: TextStyle,
    val labelMedium: TextStyle,
    val labelLight: TextStyle,
    val bodyBold: TextStyle,
    val bodyMedium: TextStyle,
    val bodyLight: TextStyle
)

val typography: Typography = Typography(
    headlineBold = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_bold
            )
        )
    ),
    headlineMedium = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        )
    ),
    headlineLight = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_light
            )
        )
    ),
    titleBold = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_bold
            )
        )
    ),
    titleMedium = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        )
    ),
    titleLight = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_light
            )
        )
    ),
    labelBold = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_bold
            )
        )
    ),
    labelMedium = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        )
    ),
    labelLight = TextStyle(
        fontSize = 16.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_light
            )
        )
    ),
    bodyBold = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_bold
            )
        )
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_medium
            )
        )
    ),
    bodyLight = TextStyle(
        fontSize = 14.sp,
        fontFamily = FontFamily(
            Font(
                resId = R.font.poppins_light
            )
        )
    )
)

val UniProfessionFontTheme = staticCompositionLocalOf { typography }