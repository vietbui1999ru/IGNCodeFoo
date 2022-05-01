package com.example.ign.models.video

import java.io.Serializable

data class Asset(
    val height: Int,
    val url: String,
    val width: Int
) : Serializable