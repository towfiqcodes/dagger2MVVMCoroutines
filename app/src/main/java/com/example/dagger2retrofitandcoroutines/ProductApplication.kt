package com.example.dagger2retrofitandcoroutines

import android.app.Application
import com.example.dagger2retrofitandcoroutines.di.ApplicationComponent
import com.example.dagger2retrofitandcoroutines.di.DaggerApplicationComponent

class ProductApplication :Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.builder().build()
    }
}