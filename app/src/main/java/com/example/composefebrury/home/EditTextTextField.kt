package com.example.composefebrury.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EditTextTextField(text: State<String>, onValueChange: (String) -> Unit) {
    val textValue = text.value
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(all = 20.dp)
            .fillMaxWidth(1f)
    ) {
        OutlinedTextField(
            value = textValue, onValueChange = onValueChange)
    }
}