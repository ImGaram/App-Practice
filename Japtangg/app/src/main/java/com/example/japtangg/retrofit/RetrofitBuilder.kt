package com.example.japtangg.retrofit

import com.example.japtangg.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    lateinit var api: Api

    init {
//        val retrofit:Retrofit = Retrofit.Builder()
//            .baseUrl("https://api.github.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        api = retrofit.create(Api::class.java)
    }
}