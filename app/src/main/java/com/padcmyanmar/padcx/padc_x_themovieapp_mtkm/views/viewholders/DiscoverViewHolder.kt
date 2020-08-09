package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_discover.view.*

class DiscoverViewHolder(itemView : View,delegate: MovieItemDelegate) : BaseMovieViewHolder<DiscoverVO>(itemView) {
    init {
        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapItem(it.id)
            }
        }
    }

    override fun bindData(data: DiscoverVO) {
        Glide
            .with(itemView)
            .load(IMAGE_BASE_URL+data.posterPath)
            .into(itemView.iv_discover_img)

        itemView.tv_discover_title.text=data.title
        itemView.tv_discover_average_rate.text=data.voteAverage

    }

}