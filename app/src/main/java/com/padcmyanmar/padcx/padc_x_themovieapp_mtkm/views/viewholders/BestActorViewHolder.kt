package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.BestActorVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_best_actor.view.*

class BestActorViewHolder(itemView : View) : BaseMovieViewHolder<BestActorVO>(itemView) {
    override fun bindData(data: BestActorVO) {
        Glide
            .with(itemView)
            .load(IMAGE_BASE_URL+data.profilePath)
            .into(itemView.iv_actor)

        itemView.tv_actor_name.text =data.name
    }
}