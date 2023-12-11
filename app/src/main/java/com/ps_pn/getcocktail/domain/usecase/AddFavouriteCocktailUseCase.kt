package com.ps_pn.getcocktail.domain.usecase

import com.ps_pn.getcocktail.domain.entity.MainCocktailModel
import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class AddFavouriteCocktailUseCase  @Inject constructor(private val repository: CocktailRepository) {

    operator fun invoke(cocktail: MainCocktailModel) = repository.addFavouriteCocktail(cocktail)
}