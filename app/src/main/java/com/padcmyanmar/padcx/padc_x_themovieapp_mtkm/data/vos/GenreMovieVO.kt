package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "genre_movie")
data class GenreMovieVO (
    @PrimaryKey
    @SerializedName("id")var id :Int =0,
    @SerializedName("name")var name :String? =""
)