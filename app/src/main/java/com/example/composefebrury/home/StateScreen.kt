package com.example.composefebrury.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefebrury.Clicker.EvenOdd
import com.example.composefebrury.MainActivity

@Composable
fun StateScreen(counter: State<Int>, onCounterClickers: () -> Unit) {

    //Когда мы в Composable функции читаем значение из State: а в MainActivity  private var countClickers = mutableStateOf(0)
    val counterValue = counter.value

    /**
     * Каждый клик у нас разный hashCode. Значит, каждый вызов функции действительно создает новый объект.
     * Это конечно не memory leak, потому что старые объекты удаляются, но все равно неприятно.
     * Хотелось бы создавать объект только один раз.
     * В этом нам поможет remember. Используем его при создании объекта EvenOdd
     */
    val evenOdd = remember() { EvenOdd() }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(vertical = 20.dp)
            .background(Color.Red)
            .padding(all = 20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "clicker: $counterValue ${evenOdd.check(counterValue)}",
            modifier = Modifier.clickable(onClick = onCounterClickers))
    }
}

//@Preview
//@Composable
//fun ViewStateScreen() {
//    StateScreen(counter = MainActivity.Counter(),onCounterClickers = {
//    })
//}