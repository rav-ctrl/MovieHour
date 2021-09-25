package com.ravctrl.moviehour.ui.TrendingMovies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ravctrl.moviehour.R
import com.ravctrl.moviehour.data.model.MovieData
import com.ravctrl.moviehour.databinding.MovieListItemBinding

class TrendingMoviesListAdapter() :
    RecyclerView.Adapter<TrendingMoviesListAdapter.MovieListViewHolder>() {

    private lateinit var movieDataList: List<MovieData>

    fun setMovieList(_movieDataList: List<MovieData>){
        movieDataList = _movieDataList
        notifyDataSetChanged()
    }

    inner class MovieListViewHolder(val movieDataBinding: MovieListItemBinding) :
        RecyclerView.ViewHolder(movieDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MovieListViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.movie_list_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        holder.movieDataBinding.movieData = movieDataList[position]
    }

    override fun getItemCount(): Int {
        return movieDataList?.size
    }

}