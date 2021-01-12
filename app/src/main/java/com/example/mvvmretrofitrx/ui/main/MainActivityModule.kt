package com.example.mvvmretrofitrx.ui.main

import androidx.lifecycle.ViewModel
import com.example.mvvmretrofitrx.di.custom.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindViewModel(viewModel: MainViewModel): ViewModel

}