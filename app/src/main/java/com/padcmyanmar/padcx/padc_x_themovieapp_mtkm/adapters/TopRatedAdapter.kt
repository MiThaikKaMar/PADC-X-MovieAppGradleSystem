package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.TopRateVO
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.CollapseViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter

class TopRatedAdapter : BaseMovieAdapter<BaseMovieViewHolder<TopRateVO>, TopRateVO>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseMovieViewHolder<TopRateVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_collapse,parent,false)
        return CollapseViewHolder(view)
    }
}