package com.typ.foodee.ui.screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.typ.foodee.data.MenuData
import com.typ.foodee.data.MenuState
import com.typ.foodee.ui.screen.util.fromHex
import com.typ.foodee.ui.theme.AppTheme

@Composable
fun TodayMenuSection(
    modifier: Modifier = Modifier,
    data: List<MenuState> = MenuData
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        LazyRow (
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ){
            items(
                items = data,
                key = { it.name }
            ){ item ->
                Menu(
                    item = item
                )
            }
        }
    }
}

@Composable
private fun Menu(
    modifier: Modifier = Modifier, item: MenuState
) {
    val backgroundColor = Color.fromHex(item.colorHex)

    Box(
        modifier = modifier
            .width(120.dp).height(160.dp)
            .customShadow(
                color = AppTheme.colors.actionSurface,
                alpha = 0.7f,
                shadowRadius = 12.dp,
                borderRadius = 48.dp,
                offsetY = 6.dp
            )
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(24.dp)
            )
    ) {
        Column  (
            modifier = modifier.padding(top = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = item.name,
                style = AppTheme.typography.titleSmall,
                color = AppTheme.colors.onBackground
            )
            Spacer(
                modifier = Modifier.height(6.dp)
            )
            MenuImage(
                image = item.image
            )
        }
    }
}

@Composable
private fun MenuImage(
    modifier: Modifier = Modifier,
    @DrawableRes image: Int
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