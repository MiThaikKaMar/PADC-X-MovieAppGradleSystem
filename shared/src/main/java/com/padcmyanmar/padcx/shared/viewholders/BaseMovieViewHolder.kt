package com.padcmyanmar.padcx.shared.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseMovieViewHolder<T>(itemView: View): RecyclerView.ViewHolder(itemView){

    var mData : T? = null

    abstract fun bindData(data : T)
}