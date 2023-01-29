package com.example.rickandmorty.data.network

import com.example.rickandmorty.data.model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {

    @GET("api/character")
    fun getCharacters(): Call<ApiResponse>
}