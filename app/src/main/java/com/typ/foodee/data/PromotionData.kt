package com.typ.foodee.data


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.typ.foodee.R
import com.typ.foodee.ui.theme.AppTheme

data class PromotionState(
    val id : Int,
    @DrawableRes val image: Int,
    val title: String,
    val label: String,
    val colorHex: String,
)

val PromotionData = listOf(
    PromotionState(
        id = 0,
        image = R.drawable.img_donut,
        title = "Free Donut!",
        label = "For orders over $20",
        colorHex = "84A59D"
    ),
    PromotionState(
        id = 1,
        image = R.drawable.img_frenchdog,
        title = "Free Frecnchdog!",
        label = "For orders over $20",
        colorHex = "F6BD60"
    ),
    PromotionState(
        id = 2,
        image = R.drawable.img_donut,
        title = "Free Donut!",
        label = "For orders over $20",
        colorHex = "84A59D"
    ),
    PromotionState(
        id = 3,
        image = R.drawable.img_frenchdog,
        title = "Free Frecnchdog!",
        label = "For orders over $20",
        colorHex = "F6BD60"
    ),

)
