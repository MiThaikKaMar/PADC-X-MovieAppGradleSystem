package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.VideoVO

data class GetVideoResponses (
    @SerializedName("id")var id :Int =0,
    @SerializedName("results")var results : ArrayList<VideoVO> = arrayListOf()
)