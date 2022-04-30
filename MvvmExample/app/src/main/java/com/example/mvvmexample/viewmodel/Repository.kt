package com.example.mvvmexample.viewmodel

import androidx.lifecycle.LiveData
import com.example.mvvmexample.model.AppDataBase
import com.example.mvvmexample.model.Entity

open class Repository(mDataBase: AppDataBase) {

    private val dao = mDataBase.dao()
    val allUsers: LiveData<List<Entity>> = dao.getAll()
    companion object {
        private var sInstance: Repository? = null
        fun getInstance(database: AppDataBase): Repository {
            return sInstance
                ?: synchronized(this) {
                    val instance = Repository(database)
                    sInstance = instance
                    instance
                }
        }
    }

    suspend fun insert(entity: Entity) {
        dao.insert(entity)
    }

    suspend fun delete(entity: Entity) {
        dao.delete(entity)
    }
}