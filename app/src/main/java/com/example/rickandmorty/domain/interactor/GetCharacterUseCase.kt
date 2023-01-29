package com.example.rickandmorty.domain.interactor

import androidx.lifecycle.MutableLiveData
import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.domain.mapper.base.Mapper
import com.example.rickandmorty.domain.model.Character
import com.example.rickandmorty.domain.repository.CharacterRepository

//class GetCharacterUseCase(
//    private val repository: CharacterRepository,
//    private val mapper: Mapper<CharacterResponse, Character>
//) {
//    fun invoke() : MutableLiveData<List<Character>> {
//        repository.getCharacterService()
//    }
//}
