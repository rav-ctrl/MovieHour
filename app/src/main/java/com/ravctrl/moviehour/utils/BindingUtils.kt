package com.ravctrl.moviehour


import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener


@BindingAdapter("image")
fun loadImage(view: ImageView, url: String) {
    val urlHeader = "https://image.tmdb.org/t/p/w500/"
    Glide.with(view)
        .load(urlHeader+url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(view)
}