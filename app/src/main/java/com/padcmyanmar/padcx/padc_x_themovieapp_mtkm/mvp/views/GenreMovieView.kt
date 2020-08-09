package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.shared.mvp.view.BaseView

interface GenreMovieView : BaseView {

    fun showData(list: List<DiscoverVO>)
    fun navigateToDetail(id : Int)
}