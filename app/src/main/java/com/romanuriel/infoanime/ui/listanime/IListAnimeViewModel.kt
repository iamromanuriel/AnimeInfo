package com.romanuriel.infoanime.ui.listanime

import com.romanuriel.infoanime.data.api.result.lanimeistresult.AnimeList
import com.romanuriel.infoanime.data.api.result.lanimeistresult.ItemAnime
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import retrofit2.Response

interface IListAnimeViewModel {
    val listAnime : MutableStateFlow<List<ItemAnime>>


    fun showList()
}