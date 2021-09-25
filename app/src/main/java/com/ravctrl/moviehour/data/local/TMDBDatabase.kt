package com.ravctrl.moviehour.data.local

import androidx.room.RoomDatabase

abstract class TMDBDatabase: RoomDatabase() {
    abstract fun trendingMovieDAO(): TrendingMoviesDAO
}