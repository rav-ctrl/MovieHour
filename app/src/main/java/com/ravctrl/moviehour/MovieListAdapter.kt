package com.ravctrl.moviehour

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter(private val names: List<String>) :
    RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder>() {

    class MovieListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txtname = itemView.findViewById(R.id.movieName) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_item, parent, false)
        return MovieListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        // Getting element from names list at this position
        val element = names[position]
        // attached shit via viewmodel
        holder.txtname.text = element
    }

    override fun getItemCount(): Int {
        return names.size
    }

}