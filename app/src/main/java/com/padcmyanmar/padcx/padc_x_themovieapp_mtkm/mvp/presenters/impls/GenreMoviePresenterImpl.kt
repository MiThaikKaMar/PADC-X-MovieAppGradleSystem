package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.GenreMoviePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.GenreMovieView

class GenreMoviePresenterImpl : GenreMoviePresenter, AbstractBasePresenter<GenreMovieView>() {


    var mPopularMovieModel: PopularMovieModel =
        PopularMovieModelImpl
    var list: List<DiscoverVO> = listOf()

    override fun onUiReady(lifecycleOwner: LifecycleOwner, paramId: Int) {
        requestData(lifecycleOwner, paramId)
    }


    private fun requestData(lifecycleOwner: LifecycleOwner, paramId: Int) {
        mPopularMovieModel.getDiscover(onSuccess = {
            mView?.showData(it)
        }, genreID = paramId)
            .observe(lifecycleOwner, Observer {
                list = it
            })
    }

    override fun onTapItem(id: Int) {
        mView?.navigateToDetail(id)
    }

}