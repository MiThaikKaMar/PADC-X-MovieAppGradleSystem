package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.AbstractBasePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.MainPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.MainView

class MainPresenterImpl: MainPresenter,
    AbstractBasePresenter<MainView>() {

    var mPopularMovieModel: PopularMovieModel =
        PopularMovieModelImpl

    override fun onUiReady(lifecycleOwner: LifecycleOwner) {
        requestBestActorData(lifecycleOwner)
        requestPopularData(lifecycleOwner)
        requestShowcaseData(lifecycleOwner)
        requestTopRatedList(lifecycleOwner)
    }

    private fun requestShowcaseData(lifecycleOwner: LifecycleOwner){
        mPopularMovieModel.getShowcaseMovie()
            .observe(lifecycleOwner, Observer {
                mView?.showShowcaseList(it)
            })
    }

    private fun requestBestActorData(lifecycleOwner: LifecycleOwner){
        mPopularMovieModel.getBestActor()
            .observe(lifecycleOwner, Observer {
                mView?.showBestActorList(it)
            })
    }

    private fun requestPopularData(lifecycleOwner: LifecycleOwner) {
        mPopularMovieModel.getAllPopularMovie()
            .observe(lifecycleOwner, Observer {
                mView?.showPopularDataList(it)
            })
    }

    private fun requestTopRatedList(lifecycleOwner: LifecycleOwner){
        mPopularMovieModel.getTopRatedMovieList()
            .observe(lifecycleOwner, Observer {
                mView?.showTopRatedList(it)
            })
    }

    override fun onTapItem(id: Int) {
        mView?.navigateToDetail(id)
    }

    override fun onTapMovieItem(id: Int) {
        mView?.navigateToVideoScreen(id)
    }
}