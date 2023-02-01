package com.example.composefebrury

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.example.composefebrury.home.StateScreen

class MainActivity : ComponentActivity() {

    private var countClickers = mutableStateOf(0) // так мы задаем значение которое будем читать
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            HomeScreen() // картинки анимации текст

            StateScreen(counter = countClickers, onCounterClickers = {
                countClickers.value++
                if (countClickers.value > 10)
                    println("Больше 10 кликов.. кликов уже ${countClickers.value}")
                else
                    Toast.makeText(this, "${countClickers.value}", Toast.LENGTH_SHORT).show()
            })
        }
    }

}
