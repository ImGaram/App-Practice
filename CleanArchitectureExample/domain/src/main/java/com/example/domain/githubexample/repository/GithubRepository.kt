package com.example.domain.githubexample.repository

import com.example.domain.githubexample.model.GithubRepo

// Github의 Repository 목록을 가져오기 위한 Repository의 인터페이스.
// GithubRepository의 구현체는 data계층에 위치한다.
interface GithubRepository {
    suspend fun getRepos(owner: String): List<GithubRepo>
}