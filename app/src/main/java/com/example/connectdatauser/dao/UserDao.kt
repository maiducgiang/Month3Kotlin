package com.example.connectdatauser.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.connectdatauser.data.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)
    @Query("select * from user where login = :login")
    fun getUser(login: String): LiveData<List<User>>
}