package com.romanuriel.infoanime.ui.detailanime

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.romanuriel.infoanime.data.api.result.animeresult.Anime
import com.romanuriel.infoanime.data.repository.DetailAnime.IDetailAnimeRepository
import com.romanuriel.infoanime.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel @Inject constructor(
    private val repository: IDetailAnimeRepository
    ):BaseViewModel(), IDetailAnimeViewModel {

    private val _dataAnime = MutableLiveData<Anime>()
    override val dataAnimeLiveData: LiveData<Anime>
        get() = _dataAnime

    override fun showData() {
        ioThread.launch {
            val result = repository.getAnimeFullById("22")
            _dataAnime.postValue(result)
        }
    }
}