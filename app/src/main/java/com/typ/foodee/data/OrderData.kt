package com.typ.foodee.data

data class OrderState(
    val amount: Int,
    val totalPrice: String,
)

val OrderData = OrderState(
    amount = 5,
    totalPrice = "$27.45"
)