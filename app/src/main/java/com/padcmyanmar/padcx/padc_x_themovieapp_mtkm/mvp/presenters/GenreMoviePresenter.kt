package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.delegates.MovieItemDelegate
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.GenreMovieView
import com.padcmyanmar.padcx.shared.mvp.presenters.BasePresenter

interface GenreMoviePresenter : BasePresenter<GenreMovieView>,MovieItemDelegate {

    fun onUiReady(lifecycleOwner: LifecycleOwner,paramId : Int)
}