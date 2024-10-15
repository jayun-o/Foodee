package com.typ.foodee.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.typ.foodee.data.MenuState
import com.typ.foodee.data.ProductPreviewState
import com.typ.foodee.ui.screen.components.BestOffer
import com.typ.foodee.ui.screen.components.HomePreviewSection
import com.typ.foodee.ui.screen.components.PromotionsToday
import com.typ.foodee.ui.screen.components.SearchSection
import com.typ.foodee.ui.screen.components.SectionHeader
import com.typ.foodee.ui.screen.components.TodayMenuSection

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            HomePreviewSection()
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            SearchSection()
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            SectionHeader(text = "Today's Menu")
        }
        item {
            PromotionsToday()
        }
        item {
            TodayMenuSection()
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        item {
            SectionHeader(text = "Best Offers \uD83D\uDC95")
        }
        item {
            BestOffer()
        }
    }
}
