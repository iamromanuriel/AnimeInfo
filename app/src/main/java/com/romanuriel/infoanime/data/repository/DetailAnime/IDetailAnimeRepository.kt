package com.romanuriel.infoanime.data.repository.DetailAnime

import com.romanuriel.infoanime.data.api.result.animeresult.Anime

interface IDetailAnimeRepository {
    suspend fun getAnimeFullById(id: String): Anime
}