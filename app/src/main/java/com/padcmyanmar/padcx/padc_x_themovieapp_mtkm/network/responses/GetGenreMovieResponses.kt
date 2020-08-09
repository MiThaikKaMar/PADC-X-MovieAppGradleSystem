package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.GenreMovieVO

data class GetGenreMovieResponses (
    @SerializedName("genres")var genres : ArrayList<GenreMovieVO>? = arrayListOf()
)