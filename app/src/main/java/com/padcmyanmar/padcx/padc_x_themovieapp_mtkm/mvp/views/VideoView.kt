package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views

import com.padcmyanmar.padcx.shared.mvp.view.BaseView

interface VideoView : BaseView {
    fun showVideo(movieKey : String)
}