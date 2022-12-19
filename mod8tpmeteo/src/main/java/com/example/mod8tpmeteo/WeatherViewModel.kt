package com.example.mod8tpmeteo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel: ViewModel() {
    val city=MutableLiveData<City>()
    val temperature= MutableLiveData<Int>(0)
    init{
        city.value = City("","0","")
    }

}