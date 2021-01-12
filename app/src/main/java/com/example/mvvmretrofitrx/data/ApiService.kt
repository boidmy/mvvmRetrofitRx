package com.example.mvvmretrofitrx.data

import io.reactivex.Observable
import retrofit2.http.GET
import java.util.*

interface ApiService {

    @GET("contacts")
    fun getAPI(): Observable<Any>
}