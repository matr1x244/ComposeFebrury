package com.example.composefebrury.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen() {
    //LinerLayout вертикальный Column
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "home screen",
            fontSize = 20.sp,
            color = Color.Cyan,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(color = Color.Yellow)
                .fillMaxWidth()
        )
        Text(
            "home screen two",
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
        )
    }

    //LinerLayout - горизонтальный ROW
    Row(
        modifier = Modifier
            .background(Color.Green),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("One")
        Spacer(modifier = Modifier.width(10.dp)) // отступ между элементами
        Text("Two")
    }

    // FrameLayout Box
    Box {
        Text("Box One")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Box Two", modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}