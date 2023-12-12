package com.ps_pn.getcocktail.di

import android.app.Application
import com.ps_pn.getcocktail.data.db.CocktailDao
import com.ps_pn.getcocktail.data.db.CocktailDataBase
import com.ps_pn.getcocktail.data.network.ApiFactory
import com.ps_pn.getcocktail.data.network.ApiService
import com.ps_pn.getcocktail.data.repository.CocktailRepoImpl
import com.ps_pn.getcocktail.domain.repository.CocktailRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
interface DataComponent {

    @Binds
    fun bindCocktailRepository(impl: CocktailRepoImpl): CocktailRepository


    companion object {
        @Provides
        fun provideCocktailDao(application: Application): CocktailDao {
            return CocktailDataBase.getInstance(application).cocktailDao()
        }

        @Provides
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }
}