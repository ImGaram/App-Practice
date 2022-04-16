package com.example.japtangg.retrofit

import com.google.gson.annotations.SerializedName

data class UserInfo(
    @SerializedName("login")    // SerializedName : 아이디를 가져옴
    val userId: String,
    val followers: Int ,
    val following: Int
)
