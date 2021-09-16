package com.ravctrl.moviehour

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListFragment : Fragment() {

    companion object {
        fun newInstance() = MovieListFragment()
    }

    private lateinit var viewModel: MovieListViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rclNames = view.findViewById<RecyclerView>(R.id.rclMovieList)

        rclNames.setHasFixedSize(true)

        // Creating an instance of our NameAdapter class and setting it to our RecyclerView
        val nameList =  getDataItems()
        val namesAdapter = MovieListAdapter(nameList)
        rclNames.adapter = namesAdapter

        rclNames.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.movie_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)
        // TODO: Use the ViewModel
    }

    // This function just creates a list of names for us
    private fun getDataItems(): MutableList<TempMovieData> {
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

        return nameList
    }

}