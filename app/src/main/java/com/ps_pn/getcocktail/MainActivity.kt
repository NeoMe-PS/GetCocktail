package com.ps_pn.getcocktail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ps_pn.getcocktail.data.db.CocktailDataBase
import com.ps_pn.getcocktail.data.mapper.CocktailMapper
import com.ps_pn.getcocktail.data.network.ApiFactory
import com.ps_pn.getcocktail.data.repository.CocktailRepoImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = CocktailRepoImpl(ApiFactory.apiService, CocktailMapper(),CocktailDataBase.getInstance(application).cocktailDao())

        val scope = CoroutineScope(Dispatchers.IO)

        scope.launch {
            val cocktail= repository.getRandomCocktail()
            Log.i("TestLOG", "$cocktail")

            val favourite = repository.getFavouriteCocktailsList()
            Log.i("TestLOG", "FAVOURITE: $favourite")
        }
    }
}