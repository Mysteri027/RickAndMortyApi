package com.example.rickandmorty.domain.repository

import com.example.rickandmorty.data.network.CharacterService


interface CharacterRepository {
    fun getCharacterService(): CharacterService
}