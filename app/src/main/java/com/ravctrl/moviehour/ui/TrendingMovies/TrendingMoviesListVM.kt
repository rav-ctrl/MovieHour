package com.ravctrl.moviehour.ui.TrendingMovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ravctrl.moviehour.data.MainRepo
import com.ravctrl.moviehour.data.remote.RetrofitService
import com.ravctrl.moviehour.data.model.TrendingMoviesDataModel
import retrofit2.Response

class TrendingMoviesListVM(val repo: MainRepo) : ViewModel() {

    lateinit var responseLiveData: LiveData<Response<TrendingMoviesDataModel>>

    fun getAllMovies(){
        responseLiveData = liveData {
            emit(repo.getTrendingMovies())
        }
    }
}
