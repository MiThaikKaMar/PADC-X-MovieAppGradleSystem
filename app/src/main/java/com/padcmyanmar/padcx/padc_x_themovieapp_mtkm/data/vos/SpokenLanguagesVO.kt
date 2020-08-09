package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class SpokenLanguagesVO (
    @SerializedName("iso_639_1")var iso6391 : String? ="",
    @SerializedName("name")var name : String? =""
)