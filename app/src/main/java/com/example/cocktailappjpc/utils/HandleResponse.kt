package com.example.cocktailappjpc.utils

import com.example.cocktailappjpc.model.Cocktails
import retrofit2.Response

interface HandleResponse<T>{
    fun handleResponse(response: Response<T>): NetworkResult<T>
}

class HandleCocktailResponse : HandleResponse<Cocktails>{

    override fun handleResponse(response: Response<Cocktails>): NetworkResult<Cocktails> {
        if (response.isSuccessful) {
            response.body()?.let { responseResult ->
                return NetworkResult.Success(responseResult)
            }
        }
        return NetworkResult.Error(response.message())
    }
}


