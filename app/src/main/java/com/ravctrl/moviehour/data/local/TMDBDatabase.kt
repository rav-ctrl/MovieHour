package com.ravctrl.moviehour.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ravctrl.moviehour.data.model.MovieData

@Database(entities = [MovieData::class], version = 1)
abstract class TMDBDatabase: RoomDatabase() {
    abstract fun trendingMovieDAO(): TrendingMoviesDAO
}