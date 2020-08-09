package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import com.google.gson.annotations.SerializedName

data class KnownForVO (
    @SerializedName("release_date")var releaseDate : String? ="",
    @SerializedName("id")var id: Int=0,
    @SerializedName("vote_count")var voteCount : String?="",
    @SerializedName("video")var video : String? ="",
    @SerializedName("media_type")var mediaType : String?="",
    @SerializedName("vote_average")var voteAverage : String? ="",
    @SerializedName("title")var title : String? ="",
    @SerializedName("genre_ids")var genreIds : ArrayList<Int>? = arrayListOf(),
    @SerializedName("original_title")var originalTitle : String?="",
    @SerializedName("original_language")var originalLanguage : String? ="",
    @SerializedName("adult") var adult :String? ="",
    @SerializedName("backdrop_path")var backdropPath : String? ="",
    @SerializedName("overview")var overview : String? ="",
    @SerializedName("poster_path")var posterPath : String? =""
    )