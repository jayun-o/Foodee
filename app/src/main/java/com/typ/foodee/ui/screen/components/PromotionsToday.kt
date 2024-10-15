package com.typ.foodee.ui.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.typ.foodee.data.PromotionData
import com.typ.foodee.data.PromotionState
import com.typ.foodee.ui.screen.util.fromHex
import com.typ.foodee.ui.theme.AppTheme

@Composable
fun PromotionsToday(
    modifier: Modifier = Modifier ,
    data: List<PromotionState> = PromotionData
) {
    Column(
        modifier = modifier.padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        LazyRow (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(
                items = data,
                key = { it.id }
            ){ item ->
                Promotion(
                    item = item
                )
            }
        }
    }
    
}

@Composable
private fun Promotion(
    modifier: Modifier = Modifier,
    item: PromotionState,
) {
    // Convert the hex string to a Color
    val backgroundColor = Color.fromHex(item.colorHex)
    ConstraintLayout (
        modifier = modifier
            .width(360.dp).height(140.dp)
            .customShadow(
                color = AppTheme.colors.actionSurface,
                alpha = 0.7f,
                shadowRadius = 12.dp,
                borderRadius = 48.dp,
                offsetY = 6.dp
            )
            // Apply the dynamic background color
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(32.dp)
            )

    ) {
        Row (
            modifier = modifier.padding(end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = modifier.padding(start = 40.dp)
            ) {
                Text(
                    text = item.title,
                    style = AppTheme.typography.titleLarge,
                    color = AppTheme.colors.surface
                )
                Spacer(
                    Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = item.label,
                    style = AppTheme.typography.labelVeryLarge,
                    color = AppTheme.colors.surface
                )
            }
            PromotionImage(
                image = item.image
            )
        }
    }
}

@Composable
private fun PromotionImage(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .height(100.dp),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(100.dp)
        )
    }
}