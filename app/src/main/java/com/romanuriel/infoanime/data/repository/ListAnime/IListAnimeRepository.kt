package com.romanuriel.infoanime.data.repository.ListAnime

import com.romanuriel.infoanime.data.api.result.lanimeistresult.AnimeList
import com.romanuriel.infoanime.data.api.result.lanimeistresult.ItemAnime
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface IListAnimeRepository {

    suspend fun getListAnime(): Flow<List<ItemAnime>>


}