package com.example.mod9tpqualiteair.dao

import androidx.room.*
import com.example.mod9tpqualiteair.data.QualiteAir

@Dao
interface QualiteAirDao {
    @Insert
    suspend fun insert(qualiteAir: QualiteAir) : Long

    @Query("SELECT * FROM QualiteAir")
    suspend fun getAll():List<QualiteAir>

    @Update
    suspend fun update(qualiteAir: QualiteAir) : Int

    @Delete
    suspend fun delete(qualiteAir: QualiteAir) : Int

}