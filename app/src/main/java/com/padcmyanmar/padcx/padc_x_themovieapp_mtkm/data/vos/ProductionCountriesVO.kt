package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class ProductionCountriesVO (
    @SerializedName("iso_3166_1")var iso31661 : String? ="",
    @SerializedName("name")var name : String? =""
)