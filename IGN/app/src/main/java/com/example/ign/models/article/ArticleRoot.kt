package com.example.ign.models.article

import java.io.Serializable


data class ArticleRoot(
    val count: Long,
    val startIndex: Long,
    val data: List<Data>,
) : Serializable

