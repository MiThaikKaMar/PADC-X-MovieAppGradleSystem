package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.DetailPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.DetailView

class DetailPresenterImpl : DetailPresenter,
    AbstractBasePresenter<DetailView>() {

    var mPopularModel : PopularMovieModel =
        PopularMovieModelImpl

    override fun onTapBackButton() {
        mView?.finishActivity()
    }

    override fun onUIReady(lifecycleOwner: LifecycleOwner,movieId:Int) {
        mPopularModel.getDetail(movieId,
            onSuccess = {
                mView?.bindDetailData(it)
            })
    }
}