package com.ravctrl.moviehour.ui.TrendingMovies

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.ravctrl.moviehour.R
import com.ravctrl.moviehour.data.MainRepo
import com.ravctrl.moviehour.data.MovieData
import com.ravctrl.moviehour.data.RetrofitService

class TrendingMovieListFragment : Fragment() {

    companion object {
        fun newInstance() = TrendingMovieListFragment()
    }

    private lateinit var VM: TrendingMoviesListVM
    private lateinit var rclNames:RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Creating an instance of our NameAdapter class and setting it to our RecyclerView
        rclNames = view.findViewById<RecyclerView>(R.id.rclMovieList)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.movie_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        VM = ViewModelProvider(this).get(TrendingMoviesListVM::class.java)
        VM.getAllMovies()
        rclNames.setHasFixedSize(true)

        val namesAdapter = TrendingMoviesListAdapter()
        namesAdapter.setMovieList(listOf()) //Sending Empty List

        rclNames.adapter = namesAdapter

        VM.responseLiveData.observe(viewLifecycleOwner, Observer {
            it?.let { it.body()?.let { it1 -> namesAdapter.setMovieList(it1?.movieData) } }
        })
    }

}