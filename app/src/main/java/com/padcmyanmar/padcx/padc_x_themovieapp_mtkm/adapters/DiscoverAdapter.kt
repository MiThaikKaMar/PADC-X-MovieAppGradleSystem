package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.DiscoverViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter

class DiscoverAdapter(delegate: MovieItemDelegate) : BaseMovieAdapter<BaseMovieViewHolder<DiscoverVO>, DiscoverVO>() {
    private val mDelegate : MovieItemDelegate = delegate
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseMovieViewHolder<DiscoverVO> {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_discover,parent,false)
        return DiscoverViewHolder(view,mDelegate)
    }
}