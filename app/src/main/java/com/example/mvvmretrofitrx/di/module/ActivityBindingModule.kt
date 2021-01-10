package com.example.mvvmretrofitrx.di.module

import com.example.mvvmretrofitrx.di.custom.ActivityScope
import com.example.mvvmretrofitrx.ui.main.MainActivity
import com.example.mvvmretrofitrx.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        MainActivityModule::class
    ])
    abstract fun mainActivity(): MainActivity
}