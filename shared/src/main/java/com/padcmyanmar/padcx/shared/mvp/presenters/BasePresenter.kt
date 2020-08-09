package com.padcmyanmar.padcx.shared.mvp.presenters

import com.padcmyanmar.padcx.shared.mvp.view.BaseView

interface BasePresenter<T: BaseView> {

    fun initPresenter(view: T)
}