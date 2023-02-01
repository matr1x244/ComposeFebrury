package com.example.composefebrury

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import com.example.composefebrury.home.CheckBoxTextField
import com.example.composefebrury.home.StateScreen

class MainActivity : ComponentActivity() {

    private val checked = mutableStateOf(true) // записываем значение для checkbox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            CheckBoxTextField(
                // записываем значения состояния нового значения checkbox
                checked = checked,
                onCheckedChange = { newCheckedValue ->
                checked.value = newCheckedValue
                    if(newCheckedValue == true){
                        println("@@@ ${checked.value}")
                    } else {
                        println("@@@ ${checked.value}")
                    }
            })

        }
    }

}
