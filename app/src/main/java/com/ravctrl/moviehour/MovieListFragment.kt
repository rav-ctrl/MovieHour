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
        val nameList =  getListOfNames()
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
    private fun getListOfNames(): MutableList<String> {
        val nameList = mutableListOf<String>()
        nameList.add("Ali")
        nameList.add("Sophia")
        nameList.add("Isabella")
        nameList.add("Mason")
        nameList.add("Jacob")
        nameList.add("William")
        nameList.add("Olivia")
        nameList.add("Jayden")
        nameList.add("Chloe")
        nameList.add("Ella")
        nameList.add("Anthony")
        nameList.add("Joshua")
        nameList.add("James")
        nameList.add("Grace")
        nameList.add("Samantha")
        nameList.add("Nicholas")
        nameList.add("Brianna")
        nameList.add("Justin")
        nameList.add("Lauren")
        nameList.add("Kimberly")

        return nameList
    }

}