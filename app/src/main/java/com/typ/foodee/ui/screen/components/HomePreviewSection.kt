package com.typ.foodee.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.typ.foodee.R
import com.typ.foodee.ui.theme.AppTheme

@Composable
fun HomePreviewSection(
    modifier: Modifier = Modifier
) {
    WelcomeBanner()
}

@Composable
private fun WelcomeBanner(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 50.dp, start = 20.dp, end = 20.dp)
            .customShadow(
                color = AppTheme.colors.actionSurface,
                alpha = 0.7f,
                shadowRadius = 12.dp,
                borderRadius = 48.dp,
                offsetY = 6.dp
            )
            .background(
                color = AppTheme.colors.regularSurface,
                shape = RoundedCornerShape(32.dp)
            )

    ) {
        Row (
            modifier = modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_profile),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Text(
                text = "Welcome back, Pin!\n" + "How Hungry are you?",
                style = AppTheme.typography.labelVeryLarge,
                color = AppTheme.colors.onBackground
            )
        }
    }
}