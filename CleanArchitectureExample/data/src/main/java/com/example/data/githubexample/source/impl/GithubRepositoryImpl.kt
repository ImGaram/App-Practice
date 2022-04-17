package com.example.data.githubexample.source.impl

import com.example.data.githubexample.source.GithubRemoteSource
import com.example.domain.githubexample.model.GithubRepo
import com.example.domain.githubexample.repository.GithubRepository
import javax.inject.Inject

// domain의 GithubRepository 를 구현한다. GithubRemoteSource를 생성자로 받아 데이터를 가져온다.
// GithubRemoteSource의 getRepos 함수는 List<GithubRepoRes>를 반환하지만,
// GithubRepoRes는 Domain 계층의 GithubRepo를 구현하고 있기 때문에 별도의 변환 과정 없이 반환이 가능하다.
class GithubRepositoryImpl @Inject constructor(
    private val githubRemoteSource: GithubRemoteSource
): GithubRepository {
    override suspend fun getRepos(owner: String): List<GithubRepo> {
        return githubRemoteSource.getRepos(owner)
    }
}