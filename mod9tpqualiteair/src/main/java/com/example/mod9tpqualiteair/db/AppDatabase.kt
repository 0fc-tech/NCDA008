package com.example.mod9tpqualiteair.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mod9tpqualiteair.dao.QualiteAirDao
import com.example.mod9tpqualiteair.data.QualiteAir

@Database(entities = [QualiteAir::class], version = 1)
abstract class AppDatabase :RoomDatabase(){
    abstract fun qualiteAirDao():QualiteAirDao

    companion object{
        private var INSTANCE : AppDatabase? = null
        fun getInstance(context: Context) : AppDatabase{
            var instance = INSTANCE
            if(instance == null){
                instance = Room.databaseBuilder(
                    context,AppDatabase::class.java,"qualiteAir")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
            }
            return instance
        }
    }
}