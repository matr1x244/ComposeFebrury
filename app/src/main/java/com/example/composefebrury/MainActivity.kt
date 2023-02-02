package com.example.composefebrury

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.example.composefebrury.home.CheckBoxTextField

class MainActivity : ComponentActivity() {

    private val checked = mutableStateOf(true) // записываем значение для checkbox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            CheckBoxTextField(

                checked = checked, // сравниваем значение

                onCheckedChange = {
                    checked.value = it // записываем значение
                })
//
//                onCheckedChangeClick = {
//                    checked.value = !checked.value // для Text сравниеваем значение
//                })

        }
    }

}
