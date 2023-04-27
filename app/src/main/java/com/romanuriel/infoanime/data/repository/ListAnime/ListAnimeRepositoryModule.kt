package com.romanuriel.infoanime.data.repository.ListAnime

import com.romanuriel.infoanime.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class ListAnimeRepositoryModule {

    @Provides
    @ViewModelScoped
    fun providerListAnimeRepository(
        apiService: ApiService
    ): IListAnimeRepository{
        return ListAnimeRepository(apiService)
    }
}