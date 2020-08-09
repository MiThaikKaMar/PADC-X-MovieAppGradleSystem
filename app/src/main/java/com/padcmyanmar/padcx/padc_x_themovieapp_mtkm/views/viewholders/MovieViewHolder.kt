package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_movie.view.*


class MovieViewHolder(itemView: View, delegate: MovieItemDelegate) :
    BaseMovieViewHolder<PopularMovieVO>(itemView) {
    init {
        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapItem(it.id)
            }
        }
    }

    override fun bindData(data: PopularMovieVO) {
        mData=data
        Glide.with(itemView.context)
            .load(IMAGE_BASE_URL + mData?.posterPath)
            .into(itemView.iv_popular_img)

        itemView.tv_title.text = mData?.originalTitle
        itemView.tv_average_rate.text = mData?.voteAverage
    }
}