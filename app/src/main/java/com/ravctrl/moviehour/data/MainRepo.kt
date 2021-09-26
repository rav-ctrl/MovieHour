package com.ravctrl.moviehour.data

import android.content.Context
import androidx.room.Room
import com.ravctrl.moviehour.data.local.TMDBDatabase
import com.ravctrl.moviehour.data.model.TrendingMoviesDataModel
import com.ravctrl.moviehour.data.remote.RetrofitService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainRepo(val applicationContext: Context) {

    suspend fun getTrendingMovies(): Response<TrendingMoviesDataModel> {
        val retService = RetrofitService
            .getRetrofitInstance()
            .create(RetrofitService::class.java)

        val db = Room.databaseBuilder(
            applicationContext,
            TMDBDatabase::class.java, "todo-list.db"
        ).build()

        GlobalScope.launch {
            retService.getTrendingMovies().body()?.movieData?.let {
                db.trendingMovieDAO().saveMovies(
                    it[0]
                )
            }
        }

        return retService.getTrendingMovies()
    }
}