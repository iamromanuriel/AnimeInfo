package com.romanuriel.infoanime.data.repository.DetailAnime

import com.romanuriel.infoanime.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DetailAnimeRepositoryModule {

    @Provides
    @ViewModelScoped
    fun providerDetailAnimeRepository(
        service: ApiService
    ): IDetailAnimeRepository{
        return DetailAnimeRepository(service)
    }
}