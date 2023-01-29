package com.example.rickandmorty.data.model

data class ApiResponse(
    val info: Info,
    val results: List<CharacterResponse>
)