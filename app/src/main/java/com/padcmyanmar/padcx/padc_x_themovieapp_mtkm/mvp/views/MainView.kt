package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.BestActorVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ShowcaseVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.TopRateVO
import com.padcmyanmar.padcx.shared.mvp.view.BaseView

interface MainView : BaseView {
    fun navigateToDetail(id : Int)
    fun showPopularDataList(list:List<PopularMovieVO>)
    fun showShowcaseList(list: List<ShowcaseVO>)
    fun showBestActorList(list: List<BestActorVO>)
    fun showTopRatedList(list: List<TopRateVO>)
    fun navigateToVideoScreen(id : Int)
}