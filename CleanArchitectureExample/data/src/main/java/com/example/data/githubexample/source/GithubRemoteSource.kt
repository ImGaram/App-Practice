package com.example.data.githubexample.source

import com.example.data.githubexample.api.GithubService
import com.example.data.githubexample.model.GithubRepoRes
import javax.inject.Inject

// GithubRemoteSource 또한 인터페이스로 구현한 뒤 구현체를 별도로 갖는 방식으로 구현했다.
interface GithubRemoteSource {
    suspend fun getRepos(owner: String): List<GithubRepoRes>
}

class GithubRemoteSourceImpl @Inject constructor(
    private val githubService: GithubService
) : GithubRemoteSource {
    override suspend fun getRepos(owner: String): List<GithubRepoRes> {
        return githubService.getRepos(owner)
    }
}