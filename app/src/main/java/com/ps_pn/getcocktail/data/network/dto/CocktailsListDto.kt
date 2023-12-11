package com.ps_pn.getcocktail.data.network.dto

import com.google.gson.annotations.SerializedName


data class CocktailsListDto (

  @SerializedName("drinks" ) var drinks : ArrayList<DtoCocktailModel> = arrayListOf()

)