package com.ps_pn.getcocktail.data.db

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ps_pn.getcocktail.data.db.model.DbCocktailModel

@Database(entities = [DbCocktailModel::class], version = 1, exportSchema = false)
abstract class CocktailDataBase : RoomDatabase() {

    abstract fun cocktailDao(): CocktailDao

    companion object {

        private const val DB_NAME = "favourite_cocktails.db"
        private val LOCK = Any()

        private var INSTANCE: CocktailDataBase? = null

        fun getInstance(application: Application): CocktailDataBase {
            INSTANCE?.let {
                return it
            }
            synchronized(LOCK) {
                val newInstance = Room.databaseBuilder(
                    application,
                    CocktailDataBase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = newInstance
                return newInstance
            }
        }
    }
}