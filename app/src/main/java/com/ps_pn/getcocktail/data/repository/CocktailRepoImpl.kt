package com.ps_pn.getcocktail.data.repository

import androidx.room.Query
import com.ps_pn.getcocktail.data.db.CocktailDao
import com.ps_pn.getcocktail.data.mapper.CocktailMapper
import com.ps_pn.getcocktail.data.network.ApiService
import com.ps_pn.getcocktail.data.network.dto.DtoCocktailModel
import com.ps_pn.getcocktail.domain.entity.MainCocktailModel
import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class CocktailRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: CocktailMapper,
    private val dao: CocktailDao
) : CocktailRepository {


    override suspend fun getById(id: String): MainCocktailModel {
        return mapper.mapDtoModelToMainModel(apiService.getCocktailById(id))
    }

    override suspend fun getResultForSearch(search: String): List<MainCocktailModel> {
        return mapper.mapDtoListToMainList(apiService.getCocktailById(search))
    }

    override suspend fun getRandomCocktail(): MainCocktailModel {
        return mapper.mapDtoModelToMainModel(apiService.getRandomCocktail())
    }

    override fun getFavouriteCocktailsList(): List<MainCocktailModel> {
        return mapper.mapDBListToMainList(dao.getFavouriteCocktails())
    }

    override fun getFavouriteCocktailById(id: String): MainCocktailModel {
        return mapper.mapDbModelToMainModel(dao.getFavouriteCocktailById(id))
    }

    override fun addFavouriteCocktail(cocktail: MainCocktailModel) {
        dao.insertFavouriteCocktail(mapper.mapMainModelToDbModel(cocktail))
    }

    override fun removeFavouriteCocktailById(id: String) {
        dao.deleteFavouriteCocktailById(id)
    }

}