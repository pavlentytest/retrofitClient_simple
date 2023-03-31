package com.example.myapplication

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface UserController {
    @POST("/hello")
    fun hello(@Body user: User): Call<Boolean>

    @GET("/list")
    fun list(): Call<List<User>>

    @GET("/get/{firstName}/{lastName}")
    fun get(@Path("firstName") firstName:String , @Path("lastName") lastName: String ): Call<User>

}