package com.example.mod7instancestate

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counter =0

    fun increment() = ++counter
}