package com.ravctrl.moviehour.data.model


import com.google.gson.annotations.SerializedName

data class TrendingMoviesDataModel(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movieData: List<MovieData>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)