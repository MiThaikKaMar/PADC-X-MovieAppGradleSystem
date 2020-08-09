package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.TopRateVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_collapse.view.*

class CollapseViewHolder(itemView: View) : BaseMovieViewHolder<TopRateVO>(itemView) {
    override fun bindData(data: TopRateVO) {
        data.let {
            Glide
                .with(itemView)
                .load(IMAGE_BASE_URL+data.posterPath)
                .into(itemView.iv_collapse)

            itemView.tv_collapse_title.text=data.title
        }
    }
}