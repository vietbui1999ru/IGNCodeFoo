package com.example.ign.models.comments

import java.io.Serializable

data class CommentsRoot(
    val content: List<Content>,
    val count: Int
) : Serializable