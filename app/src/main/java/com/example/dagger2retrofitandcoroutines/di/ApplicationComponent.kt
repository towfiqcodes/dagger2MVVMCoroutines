package com.example.dagger2retrofitandcoroutines.di

import com.example.dagger2retrofitandcoroutines.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}