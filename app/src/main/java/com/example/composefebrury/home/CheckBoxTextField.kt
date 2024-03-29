package com.example.composefebrury.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Preview(name = "CheckBoxTextField", showBackground = true, showSystemUi = true,
    device = "spec:width=1080px,height=2340px,dpi=640"
)
@Composable
fun CheckBoxTextField(
//    checked: State<Boolean>, // boolean для чексбокса
//    onCheckedChange: (Boolean) -> Unit, // unit boolean для отслеживания в checkbox
//    onCheckedChangeClick: () -> Unit // unit для отслеживания клика
) {
    var checked = remember {mutableStateOf(true)}
    val isCheckedValue = checked.value // записываем в isCheckedValue значение boolean

    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(vertical = 20.dp)
        ) {
            Checkbox(
                checked = isCheckedValue, // получаем значение
                onCheckedChange = { value -> checked.value = value } //записываем значение не с MainActivity
            )
            Text(
                text = "CheckBox Cliker",
                fontSize = 15.sp,
                modifier = Modifier

//                 .clickable(onClick = { onCheckedChange.invoke(!checked.value) })
//                .clickable(onClick = onCheckedChangeClick) // тапаем по тексту и меняем checkbox
            )
        }
        if (isCheckedValue) {
            Text(text = "НОВЫЙ ТЕКСТ!!!!!!!!!!!!!!!!!")
        }
    }
}

@Composable
private fun PreviewCheckBoxTextField() {
    CheckBoxTextField()
}