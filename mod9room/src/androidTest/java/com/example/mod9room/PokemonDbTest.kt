package com.example.mod9room

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PokemonDbTest {
    lateinit var db : AppDatabase

    @Before
    fun createDb(){
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java).build()
    }
    @Test
    fun testInsertPokemon(){
        db.pokemonDao().insert(
            Pokemon(0,"Pikachu",60,Type.ELECTRIQUE,55))
        assertTrue(db.pokemonDao().get(1).nom == "Pikachu")
    }
}