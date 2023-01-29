package com.example.rickandmorty.presentation.mainscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.domain.model.Character


class MainActivity : AppCompatActivity() {

    private var characterList = listOf<Character>()
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.main_container)


        mainViewModel = ViewModelProvider(this, MainViewModelFactory())[MainViewModel::class.java]
        Log.d("LiveData", mainViewModel.characterList.value.toString())

        mainViewModel.characterList.observe(this) {
            val adapter = MainScreenAdapter(it)
            recyclerView.adapter = adapter
        }

        Log.d("characterListLiveDataIt", characterList.toString())

    }
}