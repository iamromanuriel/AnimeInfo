package com.romanuriel.infoanime.data.repository.ListAnime

import android.util.Log
import com.romanuriel.infoanime.data.api.ApiService
import com.romanuriel.infoanime.data.api.result.lanimeistresult.AnimeList
import com.romanuriel.infoanime.data.api.result.lanimeistresult.ItemAnime
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class ListAnimeRepository(
    private val apiService: ApiService
):IListAnimeRepository {

    override suspend fun getListAnime(): Flow<List<ItemAnime>> {
        val result = apiService.getAnimeList().body()!!.data
       return flow {
           emit(result)
       }
    }

}