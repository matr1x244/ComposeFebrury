package com.example.composefebrury.home


import android.widget.Toast
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.composefebrury.R


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

        val url =
            "https://sun9-6.userapi.com/s/v1/if1/rYpnK68LRBKov1gS3Hsn5FNtATDdEibSY8koi8COayaTi7VeJLON80zLHLlYK6u1mYzWiLRR.jpg?size=2030x2030&quality=96&crop=0,7,2030,2030&ava=1"

        val infiniteTransition = rememberInfiniteTransition() //анимация вращения
        val angle by infiniteTransition.animateFloat( // задаем параметры
            initialValue = 0F,
            targetValue = 360F,
            animationSpec = infiniteRepeatable(
                animation = tween(2000, easing = LinearEasing)
            )
        )
        val context = LocalContext.current

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .crossfade(1500)
                .build(),
            placeholder = painterResource(R.drawable.ic_launcher_background), // фон если нет ответа от сервера
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .align(CenterHorizontally)
                .border(
                    5.dp,
                    Brush.linearGradient(
                        colors = listOf(
                            Color.LightGray,
                            Color.Green,
                            Color.White,
                            Color.Blue
                        )
                    ),
                    CircleShape
                )
                .rotate(50f)
                .graphicsLayer {
                    rotationZ = angle // подключаем вращение
                }
                .clickable {
                    println("@@@ CLICKER IMAGE")
                    Toast
                        .makeText(context, "CLICK ${url.toString()}", Toast.LENGTH_SHORT)
                        .show()
                }
        )
        Text(text = "Кликлни на меня", modifier = Modifier
            .align(CenterHorizontally)
            .clickable {
                Toast
                    .makeText(context, "Text: clicker", Toast.LENGTH_SHORT)
                    .show()
            })
    }

}

@Preview(showBackground = true)
@Composable
private fun HomeScreenView() {
    HomeScreen()
}