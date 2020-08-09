package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.BestActorVO
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.BestActorViewHolder
import com.padcmyanmar.padcx.shared.adapters.BaseMovieAdapter

class BestActorAdapter : BaseMovieAdapter<BaseMovieViewHolder<BestActorVO>, BestActorVO>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseMovieViewHolder<BestActorVO> {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_best_actor,parent,false)
        return BestActorViewHolder(view)
    }
}