package com.example.composefebrury.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckBoxTextField(
    checked: State<Boolean>, // boolean для чексбокса
    onCheckedChange: (Boolean) -> Unit, // unit boolean для отслеживания в checkbox
//    onCheckedChangeClick: () -> Unit // unit для отслеживания клика
) {
    val isCheckedValue = checked.value // записываем в isCheckedValue значение boolean

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(vertical = 20.dp)
    ) {
        Checkbox(checked = isCheckedValue, // получаем значение
            onCheckedChange = onCheckedChange // сравниваем значение
        )
        Text(
            text = "CheckBox Cliker",
            fontSize = 15.sp,
            modifier = Modifier
                .clickable(onClick = {onCheckedChange.invoke(!checked.value)})
//                .clickable(onClick = onCheckedChangeClick) // тапаем по тексту и меняем checkbox
        )
    }
}

//@Preview(name = "CheckBoxTextField")
//@Composable
//private fun PreviewCheckBoxTextField() {
//    CheckBoxTextField()
//}