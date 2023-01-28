package com.example.composefebrury.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box {
            Text(
                "Text Box Layout",
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.width(20.dp))
        Column (Modifier.padding(20.dp)){
            Text("Row Main, Column LinerLayout")
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}