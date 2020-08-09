package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.VideoView
import com.padcmyanmar.padcx.shared.mvp.presenters.BasePresenter

interface VideoPresenter : BasePresenter<VideoView> {
fun onUiReady(lifecycleOwner: LifecycleOwner,movieId : Int)
}