package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CastVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.CrewVO

data class GetCreditResponses (
    @SerializedName("id")var id :Int =0,
    @SerializedName("cast")var cast : ArrayList<CastVO>? = arrayListOf(),
    @SerializedName("crew")var crew : ArrayList<CrewVO>? = arrayListOf()
)