package com.example.cocktailappjpc.di

import com.example.cocktailappjpc.utils.HandleCocktailResponse

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class UtilModule {

    @Provides
    fun provideHandleNetworkResponse() : HandleCocktailResponse = HandleCocktailResponse()
}