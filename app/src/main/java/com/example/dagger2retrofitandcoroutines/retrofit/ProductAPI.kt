package com.example.dagger2retrofitandcoroutines.retrofit

import com.example.dagger2retrofitandcoroutines.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {
    @GET
    suspend fun getProducts(): Response<List<Product>>
}