package com.example.presentation.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    private val _isLoading by lazy { MutableLiveData(false) }
    val isLoading: LiveData<Boolean> by lazy { _isLoading }

    fun handleLoading(isLoading: Boolean) {
        _isLoading.postValue(isLoading)
    }
}