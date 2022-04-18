package com.example.cleanarchitectureexample.di

import com.example.data.githubexample.source.GithubRemoteSource
import com.example.data.githubexample.source.GithubRemoteSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun bindsGithubRemoteSource(source: GithubRemoteSourceImpl): GithubRemoteSource
}