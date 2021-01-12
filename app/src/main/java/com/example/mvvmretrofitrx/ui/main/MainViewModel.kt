package com.example.mvvmretrofitrx.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    private var data: MutableLiveData<Any> = MutableLiveData()

    fun getApi(): MutableLiveData<Any> {
        data = repository.getApi()
        return data
    }

    override fun onCleared() {
        repository.onCleared()
        super.onCleared()
    }
}