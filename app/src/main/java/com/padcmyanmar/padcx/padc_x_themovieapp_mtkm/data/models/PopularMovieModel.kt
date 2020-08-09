package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models

import androidx.lifecycle.LiveData
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*


interface PopularMovieModel {

    fun getAllPopularMovie() : LiveData<List<PopularMovieVO>>
    fun getAllMovieFromApiAndSaveDatabase()
    fun getMovieById(movieId : Int) : LiveData<PopularMovieVO>

    fun getDiscover(onSuccess : (List<DiscoverVO>)->Unit,genreID:Int) : LiveData<List<DiscoverVO>>

    fun getDetail(id: Int,onSuccess: (DetailVO) -> Unit)

    fun getVideo(id : Int) : LiveData<List<VideoVO>>

    fun getBestActor() : LiveData<List<BestActorVO>>

    fun getGenreMovie() : List<GenreMovieVO>

    fun getShowcaseMovie(): LiveData<List<ShowcaseVO>>

    fun getTopRatedMovieList() : LiveData<List<TopRateVO>>

}