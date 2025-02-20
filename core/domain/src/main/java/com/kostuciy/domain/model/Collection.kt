package com.kostuciy.domain.model

data class Collection(
    val id: String,
    val slug: String,
    val title: String,
    val coverImage: String,
    val description: String,
    val published: Boolean,
    val tags: List<String>,
    val videos: List<String>,
)
