package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class CastVO(
    @SerializedName("cast_id")var castId : Int =0,
    @SerializedName("character")var character : String? ="",
    @SerializedName("credit_id")var creditId : String? ="",
    @SerializedName("gender")var gender : String? ="",
    @SerializedName("id")var id : Int = 0,
    @SerializedName("name")var name : String? ="",
    @SerializedName("order")var order : String? ="",
    @SerializedName("profile_path")var profilePath : String? =""
)