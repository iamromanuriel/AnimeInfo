package com.romanuriel.infoanime.utils.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.romanuriel.infoanime.R
import com.romanuriel.infoanime.data.api.result.lanimeistresult.ItemAnime
import com.romanuriel.infoanime.databinding.CardBaseItemAnimeBinding

class AnimeBaseAdapter (val callback: (ItemAnime) -> Unit) : RecyclerView.Adapter<AnimeBaseAdapter.AnimeBasViewHolder>(){

    private var listAnime = mutableListOf<ItemAnime>()

    inner class AnimeBasViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val binding = CardBaseItemAnimeBinding.bind(view)

        fun build(itemAnime: ItemAnime, callback: (ItemAnime) -> Unit){
            binding.txtName.text = itemAnime.title
            binding.root.setOnClickListener {
                callback(itemAnime)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeBasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_base_item_anime, parent, false)
        return AnimeBasViewHolder(view)
    }

    override fun getItemCount(): Int { return listAnime.size }

    override fun onBindViewHolder(holder: AnimeBasViewHolder, position: Int) {
        val item = listAnime[position]
        holder.build(item, callback)
    }

    fun setListIteAnime(list: List<ItemAnime>){
        this.listAnime = list.toMutableList()
        notifyDataSetChanged()
    }
}