package com.typ.foodee.ui.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.typ.foodee.data.BestOfferData
import com.typ.foodee.data.BestOfferState
import com.typ.foodee.ui.theme.AppTheme

@Composable
fun BestOffer(
    modifier: Modifier = Modifier,
    data: List<BestOfferState> = BestOfferData
) {
    Column(
        modifier = modifier.padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        data.forEach { item ->
            Content(item = item)
        }
    }
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    item: BestOfferState,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(140.dp)
            .customShadow(
                color = AppTheme.colors.regularSurface,
                alpha = 0.7f,
                shadowRadius = 12.dp,
                borderRadius = 48.dp,
                offsetY = 6.dp
            )
            .background(
                color = AppTheme.colors.background,
                shape = RoundedCornerShape(32.dp)
            )
    ) {
        Row (
            modifier = modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            BestOfferImage(
                image = item.image
            )
            Column(
                modifier = modifier.padding(horizontal = 30.dp),
            ) {
                Text(
                    text = item.title,
                    style = AppTheme.typography.titleLarge,
                    color = AppTheme.colors.onSurface,
                )
                Text(
                    text = item.label,
                    style = AppTheme.typography.labelVeryLarge,
                    color = AppTheme.colors.onSurface
                )
            }

        }
    }
}

@Composable
private fun BestOfferImage(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int,
) {
    Box(
        modifier = modifier
            .height(100.dp),
        contentAlignment = Alignment.CenterStart
    ){
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(100.dp)
        )
    }
}