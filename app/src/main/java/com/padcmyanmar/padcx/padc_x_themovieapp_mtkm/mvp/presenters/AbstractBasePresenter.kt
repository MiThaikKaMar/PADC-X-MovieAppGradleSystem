package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters

import androidx.lifecycle.ViewModel
import com.padcmyanmar.padcx.shared.mvp.view.BaseView
import com.padcmyanmar.padcx.shared.mvp.presenters.BasePresenter

abstract class AbstractBasePresenter<T: BaseView> : BasePresenter<T>,ViewModel() {

    var mView : T? =null

    override fun initPresenter(view: T) {
        mView = view
    }
}