package com.example.composefebrury.Clicker

class EvenOdd() {

    fun check(value: Int): String {
        var result = if (value % 2 == 0) "чётный" else "не чётный"
        return result
    }
}