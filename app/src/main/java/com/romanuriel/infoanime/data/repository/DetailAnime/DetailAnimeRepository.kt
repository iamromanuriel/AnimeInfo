package com.romanuriel.infoanime.data.repository.DetailAnime

import com.romanuriel.infoanime.data.api.ApiService
import com.romanuriel.infoanime.data.api.result.animeresult.Anime

class DetailAnimeRepository(
    private val apiService: ApiService
):IDetailAnimeRepository {
    override suspend fun getAnimeFullById(id: String): Anime {
        return apiService.getAnimeFullById(id).body()!!
    }
}