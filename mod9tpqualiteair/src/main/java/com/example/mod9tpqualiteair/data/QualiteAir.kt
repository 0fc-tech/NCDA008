package com.example.mod9tpqualiteair.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class QualiteAir(
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0L,
    val lieu:String,
    val note:Float
)
