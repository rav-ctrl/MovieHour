package com.ravctrl.moviehour.data.local

import androidx.room.*
import com.ravctrl.moviehour.data.model.MovieData

@Dao
interface TrendingMoviesDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(MovieData: MovieData)

    @Query("DELETE FROM TrendingMovies")
    suspend fun deleteMovies()

    @Query("SELECT * FROM TrendingMovies")
    suspend fun getMovies(): List<MovieData>
}