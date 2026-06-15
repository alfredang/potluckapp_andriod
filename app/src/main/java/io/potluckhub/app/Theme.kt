package io.potluckhub.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/** Potluck brand palette — derived from the rainbow + spoon logo. */
object Brand {
    val Terracotta = Color(0xFFC9512F)
    val Teal = Color(0xFF1F6E6A)
    val Golden = Color(0xFFE5A23B)
    val Cream = Color(0xFFFFF7EC)
    val Sand = Color(0xFFFFE3BE)
    val Ink = Color(0xFF2A2622)
    val MutedInk = Color(0xFF6B6459)
    val Background = Color(0xFFFDF4E8)
    val CardShadow = Color(0x0F000000)
}

private val PotluckColors = lightColorScheme(
    primary = Brand.Terracotta,
    onPrimary = Color.White,
    secondary = Brand.Teal,
    onSecondary = Color.White,
    tertiary = Brand.Golden,
    background = Brand.Background,
    onBackground = Brand.Ink,
    surface = Color.White,
    onSurface = Brand.Ink,
    surfaceVariant = Brand.Sand,
)

@Composable
fun PotluckTheme(content: @Composable () -> Unit) {
    @Suppress("UNUSED_EXPRESSION") isSystemInDarkTheme()
    MaterialTheme(
        colorScheme = PotluckColors,
        typography = Typography(),
        content = content,
    )
}
