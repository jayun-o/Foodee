package com.typ.foodee.data


import androidx.annotation.DrawableRes
import com.typ.foodee.R

data class BestOfferState(
    val id : Int,
    @DrawableRes val image: Int,
    val title: String,
    val label: String,
)

val BestOfferData = listOf(
    BestOfferState(
        id = 0,
        image = R.drawable.img_frenchdog,
        title = "Frenchdog",
        label = "Tasty&Spicy\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F",
    ),
    BestOfferState(
        id = 1,
        image = R.drawable.img_frenchdog,
        title = "Frenchdog",
        label = "Tasty&Spicy\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F",
    ),
    BestOfferState(
        id = 2,
        image = R.drawable.img_frenchdog,
        title = "Frenchdog",
        label = "Tasty&Spicy\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F",
    ),
    BestOfferState(
        id = 3,
        image = R.drawable.img_frenchdog,
        title = "Frenchdog",
        label = "Tasty&Spicy\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F\uD83C\uDF36\uFE0F",
    ),

    )
