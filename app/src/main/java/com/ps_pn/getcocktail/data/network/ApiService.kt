package com.ps_pn.getcocktail.data.network

import com.ps_pn.getcocktail.data.network.dto.CocktailsListDto
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET(GET_RANDOM_COCKTAIL_URL)
   suspend fun getRandomCocktail(): CocktailsListDto

    @GET(GET_COCKTAIL_BY_ID_URL)
    suspend fun getCocktailById(@Path(ID) id: String):  CocktailsListDto

    @GET(Companion.GET_COCKTAILS_BY_SEARCH_URL)
    suspend fun getCocktailsBySearch(@Path(SEARCH) search: String): CocktailsListDto

    companion object {
        private const val GET_RANDOM_COCKTAIL_URL = "random.php"
        private const val GET_COCKTAIL_BY_ID_URL = "lookup.php?i={id}"
        private const val GET_COCKTAILS_BY_SEARCH_URL = "search.php?f={search}"

        private const val ID = "id"
        private const val SEARCH = "search"

    }
}


