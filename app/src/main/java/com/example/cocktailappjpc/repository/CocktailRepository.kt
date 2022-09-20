package com.example.cocktailappjpc.repository

import com.example.cocktailappjpc.api.CocktailServiceApi
import com.example.cocktailappjpc.model.Cocktails
import com.example.cocktailappjpc.utils.NetworkResult
import retrofit2.Response
import javax.inject.Inject

interface CocktailRepository {
   suspend fun getCocktails(letter:String): Response<Cocktails>
}

class CocktailRepositoryImpl @Inject constructor (
   private val cocktailsServiceApi: CocktailServiceApi
) : CocktailRepository{

   override suspend fun getCocktails(letter:String): Response<Cocktails> {
      return cocktailsServiceApi.getCocktails(letter)
   }
}