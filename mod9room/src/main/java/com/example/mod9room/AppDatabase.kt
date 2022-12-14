package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration

@Database(entities = arrayOf(Pokemon::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    //Ici on liste nos DAO
    abstract fun pokemonDao() : PokemonDao

    companion object{
        private var INSTANCE : AppDatabase? = null
        fun getInstance(context: Context) : AppDatabase{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context,AppDatabase::class.java,"pokedex")

                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
            }
            return instance
        }
    }
}