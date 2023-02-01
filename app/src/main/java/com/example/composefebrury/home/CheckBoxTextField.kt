package com.example.composefebrury.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckBoxTextField(checked: State<Boolean>, onCheckedChange: (Boolean) -> Unit) {
    val isCheckedValue = checked.value
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(vertical = 20.dp)
    ) {
        Checkbox(checked = isCheckedValue, onCheckedChange = onCheckedChange)
        Text(text = "CheckBox..", fontSize = 15.sp)
    }
}

//@Preview(name = "CheckBoxTextField")
//@Composable
//private fun PreviewCheckBoxTextField() {
//    CheckBoxTextField()
//}