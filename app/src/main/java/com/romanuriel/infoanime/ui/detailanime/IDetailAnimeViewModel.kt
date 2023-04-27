package com.romanuriel.infoanime.ui.detailanime

import androidx.lifecycle.LiveData
import com.romanuriel.infoanime.data.api.result.animeresult.Anime

interface IDetailAnimeViewModel {
    val dataAnimeLiveData: LiveData<Anime>
    fun showData()
}