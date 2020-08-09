package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class CrewVO(
    @SerializedName("credit_id")var creditId : String? ="",
    @SerializedName("department")var department : String? ="",
    @SerializedName("gender")var gender : String? ="",
    @SerializedName("id")var id : Int =0,
    @SerializedName("job")var job : String? ="",
    @SerializedName("name")var name : String? ="",
    @SerializedName("profile_path")var profilePath : String? =""
)