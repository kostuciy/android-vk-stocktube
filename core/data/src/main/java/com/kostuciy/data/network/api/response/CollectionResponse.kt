package com.kostuciy.data.network.api.response

import kotlinx.serialization.SerialName

data class CollectionResponse(
    @SerialName("cover_image") val coverImage: String,
    @SerialName("cover_video") val coverVideo: String,
    val description: String,
    val id: String,
    @SerialName("meta_description") val metaDescription: String,
    @SerialName("meta_title") val metaTitle: String,
    val published: Boolean,
    val slug: String,
    val tags: List<String>,
    val title: String,
    val videos: List<String>,
)
