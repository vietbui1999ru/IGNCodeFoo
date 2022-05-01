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

private const val BASE_URL = "https://ign-apis.herokuapp.com/"

private val gson = Gson().newBuilder()


private val retrofit =Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

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
object Api {
    val retrofitService: ApiInterface by lazy {
        retrofit.create(ApiInterface::class.java)
    }
}