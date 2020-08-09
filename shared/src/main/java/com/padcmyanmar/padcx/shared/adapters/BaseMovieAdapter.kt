package com.padcmyanmar.padcx.shared.adapters

import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padcx.shared.viewholders.BaseMovieViewHolder

abstract class BaseMovieAdapter<T : BaseMovieViewHolder<W>,W> : RecyclerView.Adapter<T>() {
    var mData : MutableList<W> = arrayListOf()

    override fun getItemCount(): Int {
        return mData.count()
    }

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.bindData(mData[position])
    }

    fun setData(data : MutableList<W>){
        mData = data
        notifyDataSetChanged()
    }

}