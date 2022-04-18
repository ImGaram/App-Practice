package com.example.cleanarchitectureexample.di

import com.example.domain.githubexample.repository.GithubRepository
import com.example.domain.githubexample.usecase.GetGithubReposUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

// domain 계층은 안드로이드에 대한 의존성이 없기 때문에 hilt의 @Inject를 통한 의존성 주입이 불가하다.
// 따라서 app 모듈에 별도의 의존성 주입을 위한 설정을 한다.
@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun providesGetGithubReposUseCase(repository: GithubRepository): GetGithubReposUseCase {
        return GetGithubReposUseCase(repository)
    }
}