package com.typ.foodee.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.typ.foodee.R
import com.typ.foodee.ui.theme.AppTheme

data class MenuState(
    @DrawableRes val image: Int,
    val name: String,
    val colorHex: String,
)

val MenuData = listOf(
    MenuState(
        image = R.drawable.img_burger,
        name = "Burgers",
        colorHex = "FFEF92"
    ),
    MenuState(
        image = R.drawable.img_fries,
        name = "Fries",
        colorHex = "F5CAC3"

    ),
    MenuState(
        image = R.drawable.img_drinks,
        name = "Drinks" ,
        colorHex = "B6D7CF"

    ),
    MenuState(
        image = R.drawable.img_donut,
        name = "Dessert",
        colorHex = "A9D7DA"
    ),
    MenuState(
        image = R.drawable.img_frenchdog,
        name = "Best",
        colorHex = "FFEF92"
    ),
)
