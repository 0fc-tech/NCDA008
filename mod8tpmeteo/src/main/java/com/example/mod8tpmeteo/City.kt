package com.example.mod8tpmeteo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(
    val city:String,
    val postCode: String,
    val region: String
): Parcelable
