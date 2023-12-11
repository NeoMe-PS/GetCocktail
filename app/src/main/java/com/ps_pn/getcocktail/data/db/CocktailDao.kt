package com.ps_pn.getcocktail.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ps_pn.getcocktail.data.db.model.DbCocktailModel
import com.ps_pn.getcocktail.data.network.dto.DtoCocktailModel


@Dao
interface CocktailDao {

    @Query("SELECT * FROM favourite_cocktails")
    fun getFavouriteCocktails(): List<DbCocktailModel>

    @Query("SELECT * FROM favourite_cocktails WHERE idDrink=:id")
    fun getFavouriteCocktailById(id: String): DbCocktailModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavouriteCocktail(cocktail:DbCocktailModel)

    @Query("DELETE  FROM favourite_cocktails WHERE idDrink=:id")
    fun deleteFavouriteCocktailById(id:String)

}