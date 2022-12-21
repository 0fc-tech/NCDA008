package com.example.mod9room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface PokemonDao {
    @Insert
    suspend fun insert(pokemon: Pokemon) : Long

    @Query("SELECT * FROM Pokemon WHERE id=:id")
    suspend fun get(id:Long):Pokemon

    @Update
    fun update(pokemon: Pokemon)

    @Delete
    fun delete(pokemon: Pokemon)

    @Delete
    fun deleteAll(lsPokemon: List<Pokemon>)
}






