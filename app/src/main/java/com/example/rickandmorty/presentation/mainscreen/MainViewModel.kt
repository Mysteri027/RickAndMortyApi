package com.example.rickandmorty.presentation.mainscreen

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmorty.data.model.ApiResponse
import com.example.rickandmorty.data.network.Common
import com.example.rickandmorty.domain.mapper.CharacterMapper
import com.example.rickandmorty.domain.model.Character
import com.example.rickandmorty.domain.repository.CharacterRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(
    private val repository: CharacterRepository,
    private val mapper: CharacterMapper,
) : ViewModel() {


    val characterList = MutableLiveData<List<Character>>()
    init {
        getCharacterList()
    }

    private fun getCharacterList(){
        val characterService = Common.getCharacterService()

        characterService.getCharacters()
            .enqueue(object : Callback<ApiResponse> {
                override fun onResponse(
                    call: Call<ApiResponse>?,
                    response: Response<ApiResponse>?
                ) {
                    if (response != null) {
                        if (response.isSuccessful) {
                            characterList.postValue(response.body().results.map {
                                mapper.map(it)
                            })
                        }
                    }
                }
                override fun onFailure(
                    call: Call<ApiResponse>?,
                    t: Throwable?
                ) {
                    Log.d("onFailureError", t.toString())
                }
            })
    }
}
