package com.example.rickandmorty.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.rickandmorty.data.model.ApiResponse
import com.example.rickandmorty.data.model.CharacterResponse
import com.example.rickandmorty.data.network.CharacterService
import com.example.rickandmorty.data.network.Common
import com.example.rickandmorty.domain.model.Character
import com.example.rickandmorty.domain.repository.CharacterRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CharacterRepositoryImpl : CharacterRepository {
    override fun getCharacterService() = Common.getCharacterService()
}