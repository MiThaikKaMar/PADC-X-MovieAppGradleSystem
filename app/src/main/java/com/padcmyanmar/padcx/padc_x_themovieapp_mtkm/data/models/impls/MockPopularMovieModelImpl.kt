//package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy.*
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*
//
//object MockPopularMovieModelImpl :
//    PopularMovieModel {
//
//
//    override fun getAllPopularMovie(): LiveData<List<PopularMovieVO>> {
//        val liveData = MutableLiveData<List<PopularMovieVO>>()
//        liveData.postValue(getDummyPopularMovieList())
//        return liveData
//    }
//
//    override fun getAllMovieFromApiAndSaveDatabase() {
//
//    }
//
//    override fun getMovieById(movieId: Int): LiveData<PopularMovieVO> {
//        val liveData = MutableLiveData<PopularMovieVO>()
//        liveData.postValue(getDummyPopularMovieDetail())
//        return liveData
//    }
//
//
//
//    override fun getDiscover(
//        onSuccess: (List<DiscoverVO>) -> Unit,
//        genreID: Int
//    ): LiveData<List<DiscoverVO>> {
//        val liveData = MutableLiveData<List<DiscoverVO>>()
//        liveData.postValue(getDummyDiscoverMovieList())
//        return liveData
//    }
//
//
//    override fun getDetail(id: Int): LiveData<PopularMovieVO> {
//        val liveData = MutableLiveData<DetailVO>()
//        liveData.postValue(getDummyPopularMovieList())
//        return liveData
//    }
//
//
//    override fun getVideo(id: Int): LiveData<List<VideoVO>> {
//        val liveData = MutableLiveData<List<VideoVO>>()
//        liveData.postValue(getDummyVideoList())
//        return liveData
//    }
//
//
//    override fun getBestActor(): LiveData<List<BestActorVO>> {
//        val liveData = MutableLiveData<List<BestActorVO>>()
//        liveData.postValue(getDummyBestActorList())
//        return liveData
//    }
//
//
//    override fun getGenreMovie(): List<GenreMovieVO> {
//        return getDummyGenreMovieList()
//    }
//
//
//    override fun getShowcaseMovie(): LiveData<List<ShowcaseVO>> {
//        val liveData = MutableLiveData<List<ShowcaseVO>>()
//        liveData.postValue(getDummyShowcaseList())
//        return liveData
//    }
//
//    override fun getTopRatedMovieList(): LiveData<List<TopRateVO>> {
//        val liveData = MutableLiveData<List<TopRateVO>>()
//        liveData.postValue(getDummyTopRatedMovieList())
//        return liveData
//    }
//
//
//}