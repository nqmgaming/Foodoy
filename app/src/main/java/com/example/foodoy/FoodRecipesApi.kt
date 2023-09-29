package com.example.foodoy

import com.example.foodoy.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET

import retrofit2.http.QueryMap

interface FoodRecipesApi {
    @GET("recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap query: Map<String, String>
    ): Response<FoodRecipe>
}