package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class BelongToCollectionVO(
    @SerializedName("id")var id :Int =0,
    @SerializedName("name")var name : String? ="",
    @SerializedName("poster_path")var posterPath : String?="",
    @SerializedName("backdrop_path")var backdropPath : String? =""
)