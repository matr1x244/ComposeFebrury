package com.example.composefebrury

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composefebrury.home.CheckBoxTextField
import com.example.composefebrury.home.StateScreen
import com.example.composefebrury.home.TextField

class MainActivity : ComponentActivity() {

    private val checked = mutableStateOf(true) // записываем значение для checkbox

    private var countClickers = mutableStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

//            StateScreen(counter = countClickers, onCounterClickers = {
//                countClickers.value++
//                Toast.makeText(this, "${countClickers.value}", Toast.LENGTH_SHORT).show()
//            })


//            val textField = remember{ mutableStateOf("")} // А функция remember позволяет сохранить это значение


            CheckBoxTextField(
                checked = checked, // сравниваем значение
                onCheckedChange = {
                    checked.value = it // записываем значение
                })


//
//                onCheckedChangeClick = {
//                    checked.value = !checked.value // для Text сравниеваем значение
//                })
//                TextField(
//                    textField = textField,
//                    onValueChangeText = { newText ->
//                        if (textField.value.length < 50) {
//                            textField.value = newText
//                        }
//                    })
        }
    }

}
