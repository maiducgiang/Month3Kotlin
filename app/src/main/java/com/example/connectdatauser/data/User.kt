package com.example.connectdatauser.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "login")
    val login: String,
    @ColumnInfo(name = "type")
    val type: String,
    @ColumnInfo(name = "url")
    val url: String
)
