package com.ps_pn.getcocktail.domain.usecase

import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import javax.inject.Inject

class GetResultForSearch @Inject constructor(private val repository: CocktailRepository) {

    operator fun invoke(search: String) = repository.getResultForSearch(search)
}