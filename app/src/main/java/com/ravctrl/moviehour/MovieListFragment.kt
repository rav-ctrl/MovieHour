package com.ravctrl.moviehour

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListFragment : Fragment() {

    companion object {
        fun newInstance() = MovieListFragment()
    }

    private lateinit var viewModel: MovieListViewModel
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
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)

        rclNames.setHasFixedSize(true)

        val movielist =  viewModel.getDataItems().value
        val namesAdapter = MovieListAdapter()
        movielist?.let { namesAdapter.setMovieList(it) }
        rclNames.adapter = namesAdapter

        viewModel.ldNameList.observe(viewLifecycleOwner, Observer {
            it?.let { namesAdapter.setMovieList(it) }
        })
    }

}