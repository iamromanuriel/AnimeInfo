package com.romanuriel.infoanime.data.api

import com.romanuriel.infoanime.utils.constant.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ModuleApi {

    @Singleton
    @Provides
    fun providerApi(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constant.BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun providerApiService(retrofit: Retrofit): ApiService{
        return retrofit.create(ApiService::class.java)
    }
}