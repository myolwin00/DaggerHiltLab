package com.emrys.daggerhiltlab.di.module

import com.emrys.daggerhiltlab.data.RetrofitService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    fun provideRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(RetrofitService::class.java)
    }
}