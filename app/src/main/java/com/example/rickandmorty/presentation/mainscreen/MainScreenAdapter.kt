package com.example.rickandmorty.presentation.mainscreen

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.rickandmorty.R
import com.example.rickandmorty.domain.model.Character

class MainScreenAdapter(
    private val characterList: List<Character>
): RecyclerView.Adapter<MainScreenAdapter.MainViewHolder>() {

    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(parent)
    }

    override fun getItemCount() = characterList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
    ) {

        private val imageView: ImageView = itemView.findViewById(R.id.character_image)
        private val nameView: TextView = itemView.findViewById(R.id.character_name)
        private val statusView: TextView = itemView.findViewById(R.id.character_status)
        private val genderView: TextView = itemView.findViewById(R.id.character_gender)
        private val originView: TextView = itemView.findViewById(R.id.character_origin)
        private val locationView: TextView = itemView.findViewById(R.id.character_origin)


        @SuppressLint("SetTextI18n")
        fun bind(character: Character) {
            Glide.with(itemView)
                .load(character.image)
                .centerCrop()
                .transform(RoundedCorners(2))
                .into(imageView)

            nameView.text = "Name: ${character.name}"
            statusView.text = "Status: ${character.status}"
            genderView.text = "Gender: ${character.gender}"
            originView.text = "Origin: ${character.origin}"
            locationView.text = "Location: ${character.location}"
        }
    }

}