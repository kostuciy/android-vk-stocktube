package com.kostuciy.domain.model

data class Video(
    val id: String,
    val createdAt: String,
    val description: String,
    val duration: Double,
    val views: Int,
    val poster: String,
    val publishedAt: String,
    val tags: List<String>,
    val thumbnail: String,
    val title: String,
    val url: String,
)
