package com.example.ign

import com.example.ign.models.article.ArticleRoot
import com.example.ign.models.comments.CommentsRoot
import com.example.ign.models.video.VideoRoot
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiInterface {

    @GET("/articles")
    fun getArticles(
        @Query("count") count : Int,
        @Query("startIndex") startIndex: Int,
    ) : Call<ArticleRoot>

    @GET("/videos")
    fun getVideos(
        @Query("count") count : Int,
        @Query("startIndex") startIndex: Int,
    ) : Call<VideoRoot>

    @GET("/comments")
    fun getComments(
        @Query("ids") count: Int
    ) : Call<CommentsRoot>

    @POST("/comments")
    fun postComments(
        @Query("ids") count: Int
    ) : Call<CommentsRoot>

}