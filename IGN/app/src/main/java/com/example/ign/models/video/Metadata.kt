package com.example.ign.models.video

import java.io.Serializable

data class Metadata(
    val description: String,
    val duration: Int,
    val networks: List<String>,
    val publishDate: String,
    val slug: String,
    val state: String,
    val title: String,
    val videoSeries: String
) : Serializable