package com.kostuciy.data.network.api.response

import kotlinx.serialization.SerialName

data class VideoResponse(
    @SerialName("aspect_ratio") val aspectRatio: String,
    @SerialName("created_at") val createdAt: String,
    val description: String,
    val downloads: Int,
    val duration: Double,
    val id: String,
    @SerialName("is_vertical") val isVertical: Boolean,
    @SerialName("max_height") val maxHeight: Int,
    @SerialName("max_width") val maxWidth: Int,
    val poster: String,
    @SerialName("published_at") val publishedAt: String,
    val tags: List<String>,
    val thumbnail: String,
    val title: String,
    @SerialName("updated_at") val updatedAt: String,
    val urls: UrlResponse,
    val views: Int,
)
