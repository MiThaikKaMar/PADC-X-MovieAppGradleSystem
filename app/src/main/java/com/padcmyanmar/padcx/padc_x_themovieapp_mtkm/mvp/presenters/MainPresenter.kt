package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.VideoViewDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.MainView
import com.padcmyanmar.padcx.shared.mvp.presenters.BasePresenter

interface MainPresenter : BasePresenter<MainView>,MovieItemDelegate,VideoViewDelegate {

    fun onUiReady(lifecycleOwner: LifecycleOwner)
}