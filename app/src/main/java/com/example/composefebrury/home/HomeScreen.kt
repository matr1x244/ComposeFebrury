package com.example.composefebrury.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(list: List<String>) {
    if (list.isEmpty()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier
                    .fillMaxSize()

            ) {
                Text("Box list emptyList...")
            }
        }
    } else {
        Column(
            horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxSize()
        ) {
            for (string in list) {
                Text(
                    "$string",
                    Modifier
                        .padding(5.dp)
                        .align(Start)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen(listOf("one", "two", "three"))
}