package com.example.composefebrury.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Image(
            painter = painterResource(id = com.example.composefebrury.R.mipmap.image_marker),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()

        )
        Icon(
            painter = painterResource(id = com.example.composefebrury.R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.align(CenterHorizontally),
            tint = Color.Green
        )
        var url = "https://гибдд12.рф/img/car__0_.webp"
        AsyncImage(
            model = url, contentDescription = null,
            modifier = Modifier.align(CenterHorizontally)
                .fillMaxWidth()
                .padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}