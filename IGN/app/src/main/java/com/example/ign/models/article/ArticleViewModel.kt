package com.example.ign.models.article

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.ign.ApiInterface
import com.example.ign.adapter.ArticleAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ArticleViewModel : ViewModel() {

    private val articles = mutableListOf<Data>()

    private lateinit var launchArticle : ArticleAdapter

    internal fun getArticleData(count: Int, startIndex: Int) {
        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val articleService: ApiInterface = api.create(ApiInterface::class.java)
        val articleCall: Call<ArticleRoot> = articleService.getArticles(
            count, startIndex
        )

        articleCall.enqueue(object : Callback<ArticleRoot> {
            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(call: Call<ArticleRoot>, response: Response<ArticleRoot>) {
                if (response.isSuccessful) {
//                    val articleList : ArticleRoot = response.body()!!
//
//                    val stringBuilder = "Count: " + articleList.count +
//                                        "\n" +
//                                        "startIndex: " + articleList.startIndex +
//                                        "\n" +
//                                        "Data: " + articleList.data
//
//                    articleData!!.text = stringBuilder
                    articles.addAll(response.body()!!.data)
//                    val articleAdapter = ArticleAdapter(applicationContext, articles)

                    launchArticle.notifyDataSetChanged()
//                    Log.i(TAG, "Response Result $articleList")
                } else {
                    Log.e(TAG, "Error")
                }

            }

            override fun onFailure(call: Call<ArticleRoot>, t: Throwable) {
                Log.e("ERrrroororor", t.message.toString())
            }

        })
    }
    companion object {

        const val BASE_URL = "https://ign-apis.herokuapp.com"
        const val TAG = "ArticleViewModel"
        lateinit var appContext: Context
    }
}