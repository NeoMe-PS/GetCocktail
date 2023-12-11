package com.ps_pn.getcocktail.data.network.dto

import com.google.gson.annotations.SerializedName


data class CocktailModelDto (

  @SerializedName("drinks" ) var drinks : ArrayList<DrinksDto> = arrayListOf()

)