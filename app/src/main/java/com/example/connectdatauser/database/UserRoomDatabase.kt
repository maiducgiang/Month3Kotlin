package com.example.connectdatauser.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.connectdatauser.dao.UserDao
import com.example.connectdatauser.data.User

@Database(
    entities = [User:: class],
    version = 1,
    exportSchema = false
)
abstract class UserRoomDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
    companion object {
        @Volatile
        private var INSTANCE: UserRoomDatabase? = null

        fun getDatabase(context: Context): UserRoomDatabase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserRoomDatabase::class.java,
                    "cat_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance

                val PREPOPULATE_DATA = listOf(
                    User(1,"null", "human", "null"),
                    User(2,"null", "human", "null"),
                    User(3,"null", "human", "null")
                )
                return instance
            }

        }
    }
}