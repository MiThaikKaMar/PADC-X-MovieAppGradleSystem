package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ShowcaseVO

data class GetShowcaseResponses (
    @SerializedName("results")var results : ArrayList<ShowcaseVO>? = arrayListOf()
)