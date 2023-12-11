package com.ps_pn.getcocktail.domain.usecase

import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class GetResultForSearchUseCase @Inject constructor(private val repository: CocktailRepository) {

    suspend operator fun invoke(search: String) = repository.getResultForSearch(search)
}