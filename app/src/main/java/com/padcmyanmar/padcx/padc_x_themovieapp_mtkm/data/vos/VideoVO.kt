package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "video_entity")
data class VideoVO (
    @PrimaryKey
    @SerializedName("id")var id : Int =0,
    @SerializedName("iso_639_1")var iso6391 : String? ="",
    @SerializedName("iso_3166_1")var iso31661 : String? ="",
    @SerializedName("key")var key : String? ="",
    @SerializedName("name")var name : String? ="",
    @SerializedName("site")var site : String? ="",
    @SerializedName("size")var size : String? ="",
    @SerializedName("type")var type : String? =""
)