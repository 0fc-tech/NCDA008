package com.example.mod8tpmeteo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel: ViewModel() {
    val listCity = mapOf (
        "Niort" to City("Niort", "79000", "Nouvelle Aquitaine"),
        "Rennes" to City("Rennes", "35000", "Bretagne"),
        "Lille" to City("Lille", "59000", "Haut de France"),
        "Marseille" to City("Marseille", "13000", "PACA"),
        "Lyon" to City("Lyon", "69000", "Auvergne Rhones Alpes"),
        "Nantes" to City("Nantes", "44000", "Pays de la Loire"),
    )
    val city = MutableLiveData<City>()
    val temperature= MutableLiveData<Int>(0)
    init{
        city.value = City("","0","")
    }
    fun getTemperature(city:City){
        this.city.value = city
        temperature.value = when(city.city){
            "Niort"-> (-5..25).random()
            "Rennes"->  (-10..20).random()
            "Lille"-> (-10..10).random()
            "Marseille"-> (0..40).random()
            "Lyon"-> (0..35).random()
            "Nantes"->  (-10..20).random()
            else -> (-10..20).random()
        }

    }
}