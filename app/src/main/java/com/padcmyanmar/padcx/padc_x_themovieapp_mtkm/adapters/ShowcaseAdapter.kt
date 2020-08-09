package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ShowcaseVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.VideoViewDelegate
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.ShowcaseViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter

class ShowcaseAdapter(delegate: VideoViewDelegate) : BaseMovieAdapter<BaseMovieViewHolder<ShowcaseVO>, ShowcaseVO>() {
    private val mDelegate = delegate
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseMovieViewHolder<ShowcaseVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_showcase,parent,false)
        return ShowcaseViewHolder(view,mDelegate)
    }
}