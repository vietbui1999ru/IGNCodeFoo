package com.example.ign

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ign.models.article.ArticleRoot
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ign.adapter.ArticleAdapter
import com.example.ign.databinding.ActivityMainBinding
import com.example.ign.models.article.Data

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private var articleData : TextView? = null
    private lateinit var rvArticles: RecyclerView

//    private var listArticle = ArrayList<ArticleRoot>()
    private val articles = mutableListOf<Data>()
    private lateinit var launchArticle : ArticleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val vpPager : ViewPager = findViewById(R.id.view_pager)
//        adapterViewPager = PagerAdapter(supportFragmentManager)
//        vpPager.adapter
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        rvArticles = findViewById(R.id.rvArticles)
        launchArticle = ArticleAdapter(this@MainActivity, articles)
        rvArticles.adapter = launchArticle
        rvArticles.layoutManager = LinearLayoutManager(this@MainActivity)


//        articleData = findViewById(R.id.)
        getArticleData(20, 60)

        }




    private fun getArticleData(count: Int, startIndex: Int) {
        val api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val articleService : ApiInterface = api.create(ApiInterface::class.java)
        val articleCall: Call<ArticleRoot> = articleService.getArticles(
            count, startIndex)

        articleCall.enqueue(object: Callback<ArticleRoot> {
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
//                    launchArticle = ArticleAdapter(applicationContext, articles)
//                    launchArticle = articleAdapter
//                    rvArticles.adapter = launchArticle
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
        const val TAG = "MainActivity"
        lateinit var appContext: Context
    }




}






