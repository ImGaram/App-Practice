package com.example.mvvmexample.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.mvvmexample.model.AppDataBase
import com.example.mvvmexample.model.Entity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {
    val Repository = Repository(AppDataBase.getDataBase(application, viewModelScope))
    var allUsers: LiveData<List<Entity>> = Repository.allUsers

    fun insert(entity: Entity) = viewModelScope.launch(Dispatchers.IO) {
        Repository.insert(entity)
    }

    fun deleteAll(entity: Entity) = viewModelScope.launch(Dispatchers.IO) {
        Repository.delete(entity)
    }

    fun getAll(): LiveData<List<Entity>> {
        return allUsers
    }
}