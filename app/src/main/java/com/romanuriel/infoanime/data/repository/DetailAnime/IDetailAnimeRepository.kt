package com.romanuriel.infoanime.data.repository.DetailAnime

import com.romanuriel.infoanime.data.api.result.Anime

interface IDetailAnimeRepository {

    suspend fun getAnimeFullById(id: String): Anime
}