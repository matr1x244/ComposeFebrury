package com.example.composefebrury.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen() {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier
            .padding(bottom = 15.dp)
            .width(200.dp).height(200.dp)
            .background(Color.Blue))
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}