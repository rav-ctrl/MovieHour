package com.ravctrl.moviehour

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.concurrent.schedule

class MovieListViewModel : ViewModel() {
    val ldNameList = MutableLiveData<MutableList<TempMovieData>>();
    // This function just creates a list of names for us
    fun getDataItems(): MutableLiveData<MutableList<TempMovieData>> {
        val urlHeader = "https://image.tmdb.org/t/p/w500/"
        val nameList = mutableListOf<TempMovieData>()

        nameList.add(TempMovieData("Ali",urlHeader+"wto7rICtlIr8MpekJhhnh2CPBK6.jpg"))
        nameList.add(TempMovieData("Sophia",urlHeader+"xeItgLK9qcafxbd8kYgv7XnMEog.jpg"))
        nameList.add(TempMovieData("Isabella",urlHeader+"kb4s0ML0iVZlG6wAKbbs9NAm6X.jpg"))
        nameList.add(TempMovieData("Mason",urlHeader+"34nDCQZwaEvsy4CFO5hkGRFDCVU.jpg"))
        nameList.add(TempMovieData("Jacob",urlHeader+"dGv2BWjzwAz6LB8a8JeRIZL8hSz.jpg"))
        nameList.add(TempMovieData("William",urlHeader+"6Y9fl8tD1xtyUrOHV2MkCYTpzgi.jpg"))
        nameList.add(TempMovieData("Olivia",urlHeader+"hRMfgGFRAZIlvwVWy8DYJdLTpvN.jpg"))
        nameList.add(TempMovieData("Jayden",urlHeader+"jGYJyPzVgrVV2bgClI9uvEZgVLE.jpg"))
        nameList.add(TempMovieData("Chloe",urlHeader+"qAZ0pzat24kLdO3o8ejmbLxyOac.jpg"))
        nameList.add(TempMovieData("Ella",urlHeader+"cP7odDzzFBD9ycxj2laTeFWGLjD.jpg"))

        ldNameList.value = nameList

        Timer().schedule(10000) {
            nameList.removeAt(0)
            nameList.removeAt(1)
            ldNameList.postValue(nameList)
            val lol: Int =0
        }

        return ldNameList
    }

    override fun onCleared() {
        super.onCleared()
    }
}