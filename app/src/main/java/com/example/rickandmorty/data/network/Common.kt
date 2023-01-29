package com.example.rickandmorty.data.network

object Common {

    private const val BASE_URL = "https://rickandmortyapi.com/"

    fun getCharacterService(): CharacterService {
        return RetrofitClient.getClient(BASE_URL).create(CharacterService::class.java)
    }


}