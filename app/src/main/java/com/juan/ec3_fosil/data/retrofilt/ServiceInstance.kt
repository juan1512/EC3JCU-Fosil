package com.juan.ec3_fosil.data.retrofilt

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://acnhapi.com/v1")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getFosilService(): FosilService = retrofit.create(FosilService::class.java)
}