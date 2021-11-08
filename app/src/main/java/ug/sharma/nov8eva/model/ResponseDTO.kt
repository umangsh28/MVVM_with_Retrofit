package ug.sharma.nov8eva.model


import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)