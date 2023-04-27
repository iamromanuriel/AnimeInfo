package com.romanuriel.infoanime.ui.listanime

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.romanuriel.infoanime.data.api.result.lanimeistresult.AnimeList
import com.romanuriel.infoanime.data.api.result.lanimeistresult.ItemAnime
import com.romanuriel.infoanime.data.repository.ListAnime.IListAnimeRepository
import com.romanuriel.infoanime.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ListAnimeViewModel @Inject constructor(
    private val repository: IListAnimeRepository
): BaseViewModel(), IListAnimeViewModel {
    private val _listAnime = MutableStateFlow<List<ItemAnime>>(emptyList())

    override val listAnime: MutableStateFlow<List<ItemAnime>>
        get() = _listAnime

    override fun showList() {
        viewModelScope.launch {
            repository.getListAnime().collect{result ->
                _listAnime.value = result
            }
        }
    }
}