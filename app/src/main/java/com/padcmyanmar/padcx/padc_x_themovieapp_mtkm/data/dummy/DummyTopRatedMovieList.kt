package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.TopRateVO

fun getDummyTopRatedMovieList(): List<TopRateVO>{

    val data1 = TopRateVO()
    val data2 = TopRateVO()
    return arrayListOf(data1,data2)
}