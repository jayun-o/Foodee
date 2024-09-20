package com.typ.foodee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.typ.foodee.data.OrderState
import com.typ.foodee.ui.screen.ProductDetailsScreen
import com.typ.foodee.ui.screen.components.ProductPreviewSection
import com.typ.foodee.ui.theme.AppTheme
//import com.typ.foodee.ui.theme.Theme

private const val PRODUCT_PRICE_PER_UNIT = 5.25
private const val  PRODUCT_CURRENCY = "$"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                var amount by remember { mutableIntStateOf(5)}
                val totalPrice by remember{ derivedStateOf { amount * PRODUCT_PRICE_PER_UNIT }}
                ProductDetailsScreen(
                    onCheckOutClicked = {},
                    onRemoveItemClicked = { if (amount > 0) amount = amount.dec() },
                    onAddItemClicked = { amount = amount.inc() },
                    orderState = OrderState(
                        amount = amount,
                        totalPrice = "$PRODUCT_CURRENCY${totalPrice}"
                    )
                )
            }
        }
    }
}