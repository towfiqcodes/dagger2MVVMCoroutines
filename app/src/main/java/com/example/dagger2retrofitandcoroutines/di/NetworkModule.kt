package com.example.dagger2retrofitandcoroutines.di

import com.example.dagger2retrofitandcoroutines.retrofit.ProductAPI
import com.example.dagger2retrofitandcoroutines.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun  providesRetrofit() : Retrofit{
        return  Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesProductAPI(retrofit: Retrofit) : ProductAPI{
        return  retrofit.create(ProductAPI::class.java)
    }
}