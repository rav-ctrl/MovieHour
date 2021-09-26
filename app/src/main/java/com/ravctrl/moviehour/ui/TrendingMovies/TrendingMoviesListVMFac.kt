package com.ravctrl.moviehour.ui.TrendingMovies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ravctrl.moviehour.data.MainRepo

class TrendingMoviesListVMFac(
    private val repo: MainRepo
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TrendingMoviesListVM(repo) as T
    }
}