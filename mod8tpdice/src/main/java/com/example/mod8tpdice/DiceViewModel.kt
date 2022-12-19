package com.example.mod8tpdice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    val valueDice = MutableLiveData(0)
    val nbSides = MutableLiveData(0)

    fun launch(maxDice: Int) {
        nbSides.value = maxDice
        valueDice.value = (1..maxDice).random()
    }
}