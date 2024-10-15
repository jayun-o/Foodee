package com.typ.foodee.ui.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.typ.foodee.ui.theme.AppTheme

@Composable
fun SectionHeader(
    modifier: Modifier = Modifier,
    text: String
) {
    Row (
        modifier = modifier.fillMaxWidth().padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = text,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground,
            modifier = modifier.fillMaxWidth()
        )
    }
}
