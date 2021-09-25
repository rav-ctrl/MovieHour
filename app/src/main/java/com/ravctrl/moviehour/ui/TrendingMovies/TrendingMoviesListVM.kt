package com.ravctrl.moviehour.ui.TrendingMovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ravctrl.moviehour.data.remote.RetrofitService
import com.ravctrl.moviehour.data.model.TrendingMoviesDataModel
import retrofit2.Response

class TrendingMoviesListVM: ViewModel() {

    lateinit var responseLiveData: LiveData<Response<TrendingMoviesDataModel>>

    fun getAllMovies(){
        val retService = RetrofitService
            .getRetrofitInstance()
            .create(RetrofitService::class.java)
        responseLiveData = liveData {
            val response = retService.getTrendingMovies()
            emit(response)
        }

    }
}
