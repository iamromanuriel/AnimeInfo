package com.romanuriel.infoanime.data.api

import com.romanuriel.infoanime.data.api.result.Anime
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{id}/full")
    suspend fun getAnimeFullById(@Path("id") id: String): Response<Anime>
}