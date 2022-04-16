package com.example.japtangg.retrofit

import retrofit2.Callback
import retrofit2.http.GET

interface Api {
    @GET("/users/ImGaram")
    fun getTest(

    ):Callback<UserInfo>
}