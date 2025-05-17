package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This data class defines a Mars photo which includes an ID and the image URL.
 * The property names of this data class are used by kotlinx.serialization to match the names of values in the JSON response.
 */
@Serializable
data class MarsPhoto(
    val id: String,
    @SerialName(value = "img_src") val imgSrc: String
)
