package com.example.ign.models.article

import java.io.Serializable

data class Thumbnail(
    val url: String,
    val size: String,
    val width: Long,
    val height: Long,
) : Serializable