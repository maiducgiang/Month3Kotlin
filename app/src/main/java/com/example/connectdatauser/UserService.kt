package com.example.connectdatauser

import com.example.connectdatauser.data.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserService {
    @GET("user")
    suspend fun getUser(): List<User>

    @POST("posts")
    suspend fun createUser(@Body user: User)
}