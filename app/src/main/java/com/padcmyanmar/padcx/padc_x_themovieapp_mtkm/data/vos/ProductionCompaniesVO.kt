package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class ProductionCompaniesVO (
    @SerializedName("id")var id : Int =0,
    @SerializedName("logo_path")var logoPath : String? ="",
    @SerializedName("name")var name : String? ="",
    @SerializedName("origin_country")var originCountry : String? =""
)