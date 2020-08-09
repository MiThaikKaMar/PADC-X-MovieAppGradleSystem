package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.DetailView
import com.padcmyanmar.padcx.shared.mvp.presenters.BasePresenter

interface DetailPresenter : BasePresenter<DetailView> {
    fun onTapBackButton()
    fun onUIReady(lifecycleOwner: LifecycleOwner,movieId : Int)
}