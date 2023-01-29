package com.example.composefebrury.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen() {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .padding(bottom = 15.dp)
                .width(200.dp)
                .height(200.dp)
//            .background(Color.Blue, shape = RoundedCornerShape(10.dp))) // закругляем края
//            .background(Color.Blue, shape = CircleShape)) // либо делаем круг
//                .background(
//                    brush = Brush.linearGradient( // можно задать градиент box
//                        colors = listOf(Color.Blue, Color.DarkGray, Color.Magenta)),
//
//                    alpha = 0.4f,
//                    shape = RoundedCornerShape(10.dp)
//                )
                .border( // можно так задать рамку у фона
                    width = 5.dp,
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Green,
                            Color.Yellow
                        )
                    ),
                    shape = RoundedCornerShape(15.dp)
                )


        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}