package com.example.ign.models.article

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ign.R
import com.example.ign.adapter.ArticleAdapter
import com.example.ign.databinding.ActivityMainBinding

class ArticleFragment : Fragment() {

    private lateinit var binding: ActivityMainBinding
    private var articleData : TextView? = null
    private lateinit var rvArticles: RecyclerView
    //    private var listArticle = ArrayList<ArticleRoot>()
    private lateinit var launchArticle : ArticleAdapter
    private lateinit var viewModel: ArticleViewModel

//    private val articles = mutableListOf<Data>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.article_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvArticles.apply {
            layoutManager = LinearLayoutManager(activity)
//            adapter = ArticleAdapter(context, articles)
            viewModel.getArticleData(5, 20)
        }
    }
}
