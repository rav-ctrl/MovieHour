package com.ravctrl.moviehour.ui.TrendingMovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ravctrl.moviehour.data.MainRepo
import com.ravctrl.moviehour.data.RetrofitService
import com.ravctrl.moviehour.data.TrendingMoviesDataModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.concurrent.schedule

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
