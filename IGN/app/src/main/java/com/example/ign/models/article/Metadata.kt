package com.example.ign.models.article

import java.io.Serializable

data class Metadata(
    val headline: String,
    val description: String,
    val publishDate: String,
    val slug: String,
    val networks: List<String>,
    val state: String,
    val objectName: String?,
) : Serializable