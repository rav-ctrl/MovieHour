package com.ravctrl.moviehour.data

import com.ravctrl.moviehour.data.model.TrendingMoviesDataModel
import com.ravctrl.moviehour.data.remote.RetrofitService
import retrofit2.Response

class MainRepo constructor(private val retrofitService: RetrofitService){

    suspend fun getTrendingMovies(): Response<TrendingMoviesDataModel> {
        val retService = RetrofitService
            .getRetrofitInstance()
            .create(RetrofitService::class.java)
        val response = retService.getTrendingMovies()
        return response
    }
}