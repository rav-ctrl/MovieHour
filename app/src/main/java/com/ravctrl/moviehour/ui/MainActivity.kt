package com.ravctrl.moviehour.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.ravctrl.moviehour.R
import com.ravctrl.moviehour.data.RetrofitService
import com.ravctrl.moviehour.data.TrendingMoviesDataModel
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

//        val retService = RetrofitService
//            .getRetrofitInstance()
//            .create(RetrofitService::class.java)
//        val responseLiveData: LiveData<Response<TrendingMoviesDataModel>> = liveData {
//            val response = retService.getTrendingMovies()
//            emit(response)
//        }
//        responseLiveData.observe(this, Observer {
//            val movieList = it.body()?.results
//            movieList?.forEach {
//                val lol = it.posterPath
//                Log.d("lol", it.title)
//            }
//        })

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}