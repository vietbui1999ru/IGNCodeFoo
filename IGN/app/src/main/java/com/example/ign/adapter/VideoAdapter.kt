package com.example.ign.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ign.R
import com.example.ign.models.video.Data

class VideoAdapter(private val context: Context?,

                     private val videos: List<Data>
) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int ) {
        val article = videos[position]

        holder.bind(article)

    }

    override fun getItemCount(): Int {
        return videos.size
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val date = itemView.findViewById<TextView>(R.id.date)
        private val headline = itemView.findViewById<TextView>(R.id.headline)
        private val articleImg = itemView.findViewById<ImageView>(R.id.article_image)
        private val description = itemView.findViewById<TextView>(R.id.description)
        private val authorImg = itemView.findViewById<ImageView>(R.id.author_image)
        private val author = itemView.findViewById<TextView>(R.id.author)
        private val comments = itemView.findViewById<TextView>(R.id.comments)

        fun bind(article: Data) {

//            date.text = article.metadata.publishDate
//            headline.text = article.metadata.headline
//            description.text = article.metadata.description
//            author.text = article.authors[0].name
//            comments.text = article.contentId
//
//            Log.i("ArticleAdapter", headline.text.toString())
//
//            Glide.with(this.itemView.context).load(article.thumbnails[1].url).into(articleImg)
//            Glide.with(this.itemView.context).load(article.authors[0].thumbnail).into(authorImg)
        }
    }

}
