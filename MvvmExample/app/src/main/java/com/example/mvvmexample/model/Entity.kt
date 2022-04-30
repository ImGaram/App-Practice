package com.example.mvvmexample.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var number1: String
)