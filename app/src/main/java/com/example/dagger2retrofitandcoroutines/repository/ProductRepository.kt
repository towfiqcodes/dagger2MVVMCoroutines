package com.example.dagger2retrofitandcoroutines.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dagger2retrofitandcoroutines.model.Product
import com.example.dagger2retrofitandcoroutines.retrofit.ProductAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val productAPI: ProductAPI) {
    private val _products = MutableLiveData<List<Product>>()

    val products : LiveData<List<Product>>
    get() = _products

    suspend fun getProducts() {
        val result = productAPI.getProducts()

        if (result.isSuccessful && result.body() !=null){
            _products.postValue(result.body())
        }
    }
}