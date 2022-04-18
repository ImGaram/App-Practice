package com.example.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.domain.githubexample.model.GithubRepo
import com.example.domain.githubexample.usecase.GetGithubReposUseCase
import com.example.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val githubReposUseCase: GetGithubReposUseCase
): BaseViewModel() {
    private val _githubRepositories = MutableLiveData<List<GithubRepo>>()
    val githubRepositories: LiveData<List<GithubRepo>> = _githubRepositories

    fun getGithubRepositories(owner: String) {
        githubReposUseCase(owner, viewModelScope) {
            _githubRepositories.value = it
        }
    }
}