package com.ravctrl.moviehour.data

import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {
    @GET("/3/movie/popular?api_key=deb820010e3fa6b5c55e99522013a6ed&language=en-US&page=1")
    suspend fun getTrendingMovies(): Response<TrendingMoviesDataModel>

    companion object{
        val BASE_URL: String = "https://api.themoviedb.org"
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
        }
    }
}