package com.example.cocktailappjpc.cache

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.cocktailappjpc.model.CacheCocktails

@Dao
interface CocktailsDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCocktails(cocktails: List<CacheCocktails>?)

    @Query("SELECT * FROM cocktails_table WHERE strDrink LIKE  :letter || '%' ORDER BY strDrink ASC ")
    fun getCocktails(letter: String): LiveData<List<CacheCocktails>>

    // Testing

    @Insert
    fun insertTestCocktail(cocktails: CacheCocktails)

    @Query("SELECT * FROM cocktails_table ORDER BY strDrink ASC ")
    fun getTestCocktail(): CacheCocktails
}