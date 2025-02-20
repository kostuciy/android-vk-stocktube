package com.kostuciy.data.network.api.response

import kotlinx.serialization.SerialName

data class PaginatedVideoResponse(
    val page: Int,
    val pages: Int,
    @SerialName("page_size") val pageSize: Int,
    val total: Int,
    val hits: List<VideoResponse>,
)

data class PaginatedCollectionResponse(
    val page: Int,
    val pages: Int,
    @SerialName("page_size") val pageSize: Int,
    val total: Int,
    val hits: List<CollectionResponse>,
)
