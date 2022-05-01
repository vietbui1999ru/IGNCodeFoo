package com.example.ign.models.article

import java.io.Serializable

data class Author(
    val name: String,
    val thumbnail: String,
) : Serializable