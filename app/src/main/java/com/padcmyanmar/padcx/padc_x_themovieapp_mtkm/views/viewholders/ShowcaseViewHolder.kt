package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ShowcaseVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.VideoViewDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder
import kotlinx.android.synthetic.main.item_showcase.view.*


class ShowcaseViewHolder(itemView: View,delegate: VideoViewDelegate) : BaseMovieViewHolder<ShowcaseVO>(itemView){
    override fun bindData(data: ShowcaseVO) {
        mData=data
        Glide
            .with(itemView)
            .load(IMAGE_BASE_URL+data.posterPath)
            .into(itemView.iv_showcase_img)

        itemView.tv_showcase_title.text=data.title
        itemView.tv_showcase_date.text=data.releaseDate
    }

    init {
        itemView.setOnClickListener {
            mData?.let {
                delegate.onTapMovieItem(it.id)
            }
        }
    }
}