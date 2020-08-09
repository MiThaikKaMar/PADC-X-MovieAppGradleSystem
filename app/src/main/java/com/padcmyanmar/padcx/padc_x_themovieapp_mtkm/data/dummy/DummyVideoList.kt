package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.VideoVO


fun getDummyVideoList(): List<VideoVO> {

    var data1 = VideoVO()
    var data2 = VideoVO()
    return arrayListOf(data1,data2)
}