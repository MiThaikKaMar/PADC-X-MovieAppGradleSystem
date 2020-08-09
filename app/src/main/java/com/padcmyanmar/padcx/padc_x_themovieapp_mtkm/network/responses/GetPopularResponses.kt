package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO

data class GetPopularResponses (
    @SerializedName("page")var page : String? ="",
    @SerializedName("total_results")var totalResults : String? ="",
    @SerializedName("total_pages")var totalPages : String? ="",
    @SerializedName("results")var results : ArrayList<PopularMovieVO>? = arrayListOf()
)