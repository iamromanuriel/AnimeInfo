package com.romanuriel.infoanime.ui.detailanime

import androidx.lifecycle.LiveData
import com.romanuriel.infoanime.data.api.result.Anime
import com.romanuriel.infoanime.data.repository.DetailAnime.DetailAnimeRepository
import dagger.Binds
import dagger.hilt.android.scopes.ViewModelScoped

interface IDetailAnimeViewModel {
    val dataAnimeLiveData: LiveData<Anime>
    fun showData()
}