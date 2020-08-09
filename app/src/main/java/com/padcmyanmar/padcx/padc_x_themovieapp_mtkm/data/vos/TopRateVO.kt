package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters.GenreIdsTypeConverter

@Entity(tableName = "top_rated_entity")
@TypeConverters(GenreIdsTypeConverter::class)
data class TopRateVO (
    @SerializedName("popularity")var popularity : String? ="",
    @SerializedName("vote_count")var voteCount : String? ="",
    @SerializedName("video")var video : String? ="",
    @SerializedName("poster_path")var posterPath : String? = "",
    @PrimaryKey
    @SerializedName("id")var id : Int = 0,
    @SerializedName("adult")var adult : String? ="",
    @SerializedName("backdrop_path")var backdropPath :String? = "",
    @SerializedName("original_language")var originalLanguage : String? ="",
    @SerializedName("original_title")var originalTitle : String? ="",
    @SerializedName("genre_ids")var genreIds : ArrayList<Int>? = arrayListOf(),
    @SerializedName("title")var title : String? ="",
    @SerializedName("vote_average")var voteAverage : String? = "",
    @SerializedName("overview")var overview : String? ="",
    @SerializedName("release_date")var releaseDate : String? =""
)