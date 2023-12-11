package com.ps_pn.getcocktail.domain.repository

import com.ps_pn.getcocktail.domain.entity.CocktailModel

interface CocktailRepository {

    fun getById(id:String):CocktailModel

    fun getResultForSearch(search:String):List<CocktailModel>

    fun getRandomCocktail():CocktailModel

}