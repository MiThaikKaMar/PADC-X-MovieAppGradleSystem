package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.MovieViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter

class MovieAdapter(delegate : MovieItemDelegate) : BaseMovieAdapter<BaseMovieViewHolder<PopularMovieVO>, PopularMovieVO>() {

    val mDetailDelegate = delegate

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseMovieViewHolder<PopularMovieVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        return MovieViewHolder(view,mDetailDelegate)
    }
}