package com.example.ign.models.article

import java.io.Serializable

data class Data(
    val contentId: String,
    val contentType: String,
    val thumbnails: List<Thumbnail>,
    val metadata: Metadata,
    val tags: List<String>,
    val authors: List<Author>,
    var commentCount: Int?,
    var articleType: Int?

) : Serializable