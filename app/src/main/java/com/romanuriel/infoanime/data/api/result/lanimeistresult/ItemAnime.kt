package com.romanuriel.infoanime.data.api.result.lanimeistresult

data class ItemAnime(
    val episodes: Int,              //
    val genres: List<Genre>,        //
    val images: Images,             //
    val mal_id: Int,                //
    val title: String,              //
    val title_japanese: String,     //
    val year: Int
)