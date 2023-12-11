package com.ps_pn.getcocktail.domain.repository

import com.ps_pn.getcocktail.domain.entity.MainCocktailModel

interface CocktailRepository {

    suspend fun getById(id:String):MainCocktailModel

    suspend fun getResultForSearch(search:String):List<MainCocktailModel>

    suspend fun getRandomCocktail():MainCocktailModel

    fun getFavouriteCocktailsList():List<MainCocktailModel>
    fun getFavouriteCocktailById(id:String):MainCocktailModel
    fun addFavouriteCocktail(cocktail:MainCocktailModel)
    fun removeFavouriteCocktailById(id:String)



}