package com.ps_pn.getcocktail.data.mapper

import com.ps_pn.getcocktail.data.db.model.DbCocktailModel
import com.ps_pn.getcocktail.data.network.dto.DtoCocktailModel
import com.ps_pn.getcocktail.data.network.dto.CocktailsListDto
import com.ps_pn.getcocktail.domain.entity.MainCocktailModel

class CocktailMapper {



    fun mapDtoModelToMainModel(dtoList: CocktailsListDto): MainCocktailModel {
        val dto = dtoList.drinks[0]
        return mapDtoModelToMainModel(dto)
    }

    fun mapDtoListToMainList(dtoResult: CocktailsListDto):List<MainCocktailModel>{
        val list = dtoResult.drinks
       return  list.map { mapDtoModelToMainModel(it) }
    }
    fun mapDBListToMainList(dbModels: List<DbCocktailModel>):List<MainCocktailModel>{
        return  dbModels.map { mapDbModelToMainModel(it) }
    }

    fun mapDbModelToMainModel(dbModel: DbCocktailModel):MainCocktailModel{
         return MainCocktailModel(
            idDrink = dbModel.idDrink,
            strDrink = dbModel.strDrink,
            strCategory = dbModel.strCategory,
            strAlcoholic = dbModel.strAlcoholic,
            strGlass = dbModel.strGlass,
            strInstructions = dbModel.strInstructions,
            strDrinkThumb = dbModel.strDrinkThumb,

            strIngredient1 = dbModel.strIngredient1,
            strIngredient2 = dbModel.strIngredient2,
            strIngredient3 = dbModel.strIngredient3,
            strIngredient4 = dbModel.strIngredient4,
            strIngredient5 = dbModel.strIngredient5,
            strIngredient6 = dbModel.strIngredient6,
            strIngredient7 = dbModel.strIngredient7,
            strIngredient8 = dbModel.strIngredient8,
            strIngredient9 = dbModel.strIngredient9,
            strIngredient10 = dbModel.strIngredient10,
            strIngredient11 = dbModel.strIngredient11,
            strIngredient12 = dbModel.strIngredient12,
            strIngredient13 = dbModel.strIngredient13,
            strIngredient14 = dbModel.strIngredient14,
            strIngredient15 = dbModel.strIngredient15,

            strMeasure1 = dbModel.strMeasure1,
            strMeasure2 = dbModel.strMeasure2,
            strMeasure3 = dbModel.strMeasure3,
            strMeasure4 = dbModel.strMeasure4,
            strMeasure5 = dbModel.strMeasure5,
            strMeasure6 = dbModel.strMeasure6,
            strMeasure7 = dbModel.strMeasure7,
            strMeasure8 = dbModel.strMeasure8,
            strMeasure9 = dbModel.strMeasure9,
            strMeasure10 = dbModel.strMeasure10,
            strMeasure11 = dbModel.strMeasure11,
            strMeasure12 = dbModel.strMeasure12,
            strMeasure13 = dbModel.strMeasure13,
            strMeasure14 = dbModel.strMeasure14,
            strMeasure15 = dbModel.strMeasure15,
        )
    }

    private fun mapDtoModelToMainModel(dto: DtoCocktailModel): MainCocktailModel {
        return MainCocktailModel(
            idDrink = dto.idDrink,
            strDrink = dto.strDrink,
            strCategory = dto.strCategory,
            strAlcoholic = dto.strAlcoholic,
            strGlass = dto.strGlass,
            strInstructions = dto.strInstructions,
            strDrinkThumb = dto.strDrinkThumb,

            strIngredient1 = dto.strIngredient1,
            strIngredient2 = dto.strIngredient2,
            strIngredient3 = dto.strIngredient3,
            strIngredient4 = dto.strIngredient4,
            strIngredient5 = dto.strIngredient5,
            strIngredient6 = dto.strIngredient6,
            strIngredient7 = dto.strIngredient7,
            strIngredient8 = dto.strIngredient8,
            strIngredient9 = dto.strIngredient9,
            strIngredient10 = dto.strIngredient10,
            strIngredient11 = dto.strIngredient11,
            strIngredient12 = dto.strIngredient12,
            strIngredient13 = dto.strIngredient13,
            strIngredient14 = dto.strIngredient14,
            strIngredient15 = dto.strIngredient15,

            strMeasure1 = dto.strMeasure1,
            strMeasure2 = dto.strMeasure2,
            strMeasure3 = dto.strMeasure3,
            strMeasure4 = dto.strMeasure4,
            strMeasure5 = dto.strMeasure5,
            strMeasure6 = dto.strMeasure6,
            strMeasure7 = dto.strMeasure7,
            strMeasure8 = dto.strMeasure8,
            strMeasure9 = dto.strMeasure9,
            strMeasure10 = dto.strMeasure10,
            strMeasure11 = dto.strMeasure11,
            strMeasure12 = dto.strMeasure12,
            strMeasure13 = dto.strMeasure13,
            strMeasure14 = dto.strMeasure14,
            strMeasure15 = dto.strMeasure15,
        )
    }

    fun mapMainModelToDbModel(mainModel: MainCocktailModel):DbCocktailModel{
        return DbCocktailModel(
            idDrink = mainModel.idDrink?:UNKNOWN_ID,
            strDrink = mainModel.strDrink,
            strCategory = mainModel.strCategory,
            strAlcoholic = mainModel.strAlcoholic,
            strGlass = mainModel.strGlass,
            strInstructions = mainModel.strInstructions,
            strDrinkThumb = mainModel.strDrinkThumb,

            strIngredient1 = mainModel.strIngredient1,
            strIngredient2 = mainModel.strIngredient2,
            strIngredient3 = mainModel.strIngredient3,
            strIngredient4 = mainModel.strIngredient4,
            strIngredient5 = mainModel.strIngredient5,
            strIngredient6 = mainModel.strIngredient6,
            strIngredient7 = mainModel.strIngredient7,
            strIngredient8 = mainModel.strIngredient8,
            strIngredient9 = mainModel.strIngredient9,
            strIngredient10 = mainModel.strIngredient10,
            strIngredient11 = mainModel.strIngredient11,
            strIngredient12 = mainModel.strIngredient12,
            strIngredient13 = mainModel.strIngredient13,
            strIngredient14 = mainModel.strIngredient14,
            strIngredient15 = mainModel.strIngredient15,

            strMeasure1 = mainModel.strMeasure1,
            strMeasure2 = mainModel.strMeasure2,
            strMeasure3 = mainModel.strMeasure3,
            strMeasure4 = mainModel.strMeasure4,
            strMeasure5 = mainModel.strMeasure5,
            strMeasure6 = mainModel.strMeasure6,
            strMeasure7 = mainModel.strMeasure7,
            strMeasure8 = mainModel.strMeasure8,
            strMeasure9 = mainModel.strMeasure9,
            strMeasure10 = mainModel.strMeasure10,
            strMeasure11 = mainModel.strMeasure11,
            strMeasure12 = mainModel.strMeasure12,
            strMeasure13 = mainModel.strMeasure13,
            strMeasure14 = mainModel.strMeasure14,
            strMeasure15 = mainModel.strMeasure15,
        )
    }
    companion object{
        private const val UNKNOWN_ID = "UNKNOWN_ID"
    }
}