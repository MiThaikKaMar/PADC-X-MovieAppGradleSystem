package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.GenreMovieVO


fun getDummyGenreMovieList(): List<GenreMovieVO> {
    var data1=GenreMovieVO()
    var data2 = GenreMovieVO()
    return arrayListOf(data1,data2)
}