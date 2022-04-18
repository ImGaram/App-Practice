package com.example.domain.githubexample.usecase

import com.example.domain.githubexample.model.GithubRepo
import com.example.domain.githubexample.repository.GithubRepository
import kotlinx.coroutines.*

// github에서 repository 목록을 가져오는 기능을 제공하는 usecase 이다.
// GithubRepository를 생성자로 주입받아 데이터를 가져온다.
class GetGithubReposUseCase(private val githubRepository: GithubRepository) {
    operator fun invoke(
        owner: String,
        scope: CoroutineScope,
        onResult: (List<GithubRepo>) -> Unit = {}
    ) {
        scope.launch(Dispatchers.Main) {
            val deferred = async(Dispatchers.IO) {
                githubRepository.getRepos(owner)
            }
            onResult(deferred.await())
        }
    }
}