package com.romanuriel.infoanime.data.api.result.lanimeistresult

data class AnimeList(
    val `data`: List<ItemAnime>,
    val pagination: Pagination?
)