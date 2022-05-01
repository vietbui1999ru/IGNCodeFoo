package com.example.ign.models.video

import java.io.Serializable

data class VideoRoot(
    val count: Int,
    val `data`: List<Data>,
    val startIndex: Int
) : Serializable