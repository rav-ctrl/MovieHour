package com.ravctrl.moviehour

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ravctrl.moviehour.databinding.MovieListItemBinding

class MovieListAdapter() :
    RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder>() {

    private lateinit var movieDataList: List<TempMovieData>

    fun setMovieList(_movieDataList: MutableList<TempMovieData>){
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
        return movieDataList.size
    }

}