package com.ps_pn.getcocktail.domain.usecase

import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class GetRandomCocktailUseCase @Inject constructor(private val repository: CocktailRepository) {

    suspend operator fun invoke() = repository.getRandomCocktail()
}