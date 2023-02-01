package com.example.composefebrury

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import com.example.composefebrury.home.HomeScreen
import com.example.composefebrury.home.StateScreen

class MainActivity : ComponentActivity() {

    private var countClickers = mutableStateOf(0) // так мы задаем значение которое будем читать
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            HomeScreen() // картинки анимации текст

            StateScreen(counter = countClickers, onCounterClickers = {
                countClickers.value++
                Toast.makeText(this, "${countClickers.value}", Toast.LENGTH_SHORT).show()
            })
        }
    }

    inner class Counter() {
        var value = 0
    }
}
