package com.kostuciy.data.network.api.response

import kotlinx.serialization.SerialName

data class UrlResponse(
    val mp4: String,
    @SerialName("mp4_download") val mp4Download: String,
    @SerialName("mp4_preview") val mp4Preview: String,
)
