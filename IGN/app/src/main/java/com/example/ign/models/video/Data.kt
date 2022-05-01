package com.example.ign.models.video

import java.io.Serializable

data class Data(
    val assets: List<Asset>,
    val contentId: String,
    val contentType: String,
    val metadata: Metadata,
    val tags: List<String>,
    val thumbnails: List<Thumbnail>,
    var commentCount: Int?
) : Serializable