package com.example.composefebrury.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefebrury.R

@Composable
fun TextField(textField: State<String>, onValueChangeText: (String) -> Unit) {

    val textValue = textField.value

    Column(
        modifier = Modifier
            .padding(horizontal = 50.dp, vertical = 100.dp)
    ) {
        OutlinedTextField(
            value = textValue,
            onValueChange = onValueChangeText,
            textStyle = TextStyle(fontSize = 20.sp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 7,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Поиск",
                    modifier = Modifier.size(50.dp),
                    tint = Color.Green
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Color.Red,
                focusedBorderColor = Color.Green, // цвет при получении фокуса
                unfocusedBorderColor = Color.LightGray,  // цвет при отсутствии фокуса
                cursorColor = Color.Yellow,
            ),
            label = {
                Text(text = "Поиск BIN")
            },
            placeholder = {
                Text(text = "Hint text placeholder")
            },
            shape = RoundedCornerShape(5.dp)

        )
        Text(
            text = "${textValue.length} / 50",
            textAlign = TextAlign.Justify,
            color = Blue,
            style = MaterialTheme.typography.caption, //use the caption text style
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 5.dp)
        )
    }

}