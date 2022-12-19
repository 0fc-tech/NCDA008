package com.example.mod7instancestate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val counter = MutableLiveData<Int>(0)

    fun increment() {
        counter.value = counter.value?.inc()
    }
}