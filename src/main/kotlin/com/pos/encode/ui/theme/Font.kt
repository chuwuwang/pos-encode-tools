package com.pos.encode.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

private val lightFont = Font("font/gy_light.otf", FontWeight.W300)
private val regularFont = Font("font/gy_regular.ttf", FontWeight.W400)
private val mediumFont = Font("font/gy_medium.otf", FontWeight.W500)
private val semiBoldFont = Font("font/gy_semi_bold.otf", FontWeight.W600)
private val boldFont = Font("font/gy_bold.ttf", FontWeight.W700)
private val heavyFont = Font("font/gy_heavy.ttf", FontWeight.W900)

// Create a font family to use in TextStyles
val POSFontFamily = FontFamily(lightFont, regularFont, mediumFont, boldFont)

val boldFontFamily = FontFamily(boldFont)
val mediumFontFamily = FontFamily(mediumFont)
