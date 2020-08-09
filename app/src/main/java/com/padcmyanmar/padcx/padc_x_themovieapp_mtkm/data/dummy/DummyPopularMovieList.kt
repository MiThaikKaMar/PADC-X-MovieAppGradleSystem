package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO

fun getDummyPopularMovieList(): List<PopularMovieVO>{

    val data1 = PopularMovieVO()
    val data2 = PopularMovieVO()
    return arrayListOf(data1,data2)
}