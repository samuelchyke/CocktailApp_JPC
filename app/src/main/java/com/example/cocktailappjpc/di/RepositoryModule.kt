package com.example.cocktailappjpc.di

import com.example.cocktailappjpc.repository.CacheCocktailRepository
import com.example.cocktailappjpc.repository.CacheCocktailRepositoryImpl
import com.example.cocktailappjpc.repository.CocktailRepository
import com.example.cocktailappjpc.repository.CocktailRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun provideRepository( cocktailRepositoryImpl: CocktailRepositoryImpl): CocktailRepository

    @Binds
    @ViewModelScoped
    abstract fun provideCacheRepository( cacheRepositoryImpl: CacheCocktailRepositoryImpl): CacheCocktailRepository

}