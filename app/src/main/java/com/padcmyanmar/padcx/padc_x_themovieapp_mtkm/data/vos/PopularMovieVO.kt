package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters.GenreIdsTypeConverter

@Entity(tableName = "popularMovies")
@TypeConverters(GenreIdsTypeConverter::class)
data class PopularMovieVO (
    @SerializedName("popularity")var popularity : String? ="",
    @PrimaryKey
    @SerializedName("id")var id : Int = 0,
    @SerializedName("video")var video : String? ="",
    @SerializedName("vote_count")var voteCount : String? ="",
    @SerializedName("vote_average")var voteAverage : String? = "",
    @SerializedName("title")var title : String? ="",
    @SerializedName("release_date")var releaseDate : String? ="",
    @SerializedName("original_language")var originalLanguage : String? ="",
    @SerializedName("original_title")var originalTitle : String? ="",
    @SerializedName("genre_ids")var genreIds : ArrayList<Int>? = arrayListOf(),
    @SerializedName("backdrop_path")var backdropPath :String? = "",
    @SerializedName("adult")var adult : String? ="",
    @SerializedName("overview")var overview : String? ="",
    @SerializedName("poster_path")var posterPath : String? = ""


)