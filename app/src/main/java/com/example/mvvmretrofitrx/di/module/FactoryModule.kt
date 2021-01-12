package com.example.mvvmretrofitrx.di.module

import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrofitrx.ui.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class FactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}