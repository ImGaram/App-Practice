package com.example.data.githubexample.model

import com.example.domain.githubexample.model.GithubRepo
import com.google.gson.annotations.SerializedName

// github api 를 통해 데이터를 가져올 클래스 domain 의 githubRepo 를 구현한다.
data class GithubRepoRes(
    @SerializedName("name") private val _name: String,
    @SerializedName("id") private val _id: String,
    @SerializedName("created_at") private val _date: String,
    @SerializedName("html_url") private val _url: String
): GithubRepo {
    override val name: String
        get() = _name
    override val url: String
        get() = _url
}
