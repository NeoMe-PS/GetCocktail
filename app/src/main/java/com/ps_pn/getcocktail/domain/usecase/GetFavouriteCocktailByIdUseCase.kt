package com.ps_pn.getcocktail.domain.usecase

import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class GetFavouriteCocktailByIdUseCase @Inject constructor(private val repository: CocktailRepository) {

    operator fun invoke(id:String) = repository.getFavouriteCocktailById(id)
}