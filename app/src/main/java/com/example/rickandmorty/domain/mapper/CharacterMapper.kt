package com.example.rickandmorty.domain.mapper

import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.domain.mapper.base.Mapper
import com.example.rickandmorty.domain.model.Character

class CharacterMapper : Mapper<CharacterResponse, Character>() {

    override fun map(from: CharacterResponse): Character = from.run {
        Character(
            id = id,
            name = name,
            status = status,
            gender = gender,
            origin = origin.name,
            location = location.name,
            image = image
        )
    }
}