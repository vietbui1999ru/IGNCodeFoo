package com.example.ign.models.video

import java.io.Serializable

data class Thumbnail(
    val height: Int,
    val size: String,
    val url: String,
    val width: Int
) : Serializable