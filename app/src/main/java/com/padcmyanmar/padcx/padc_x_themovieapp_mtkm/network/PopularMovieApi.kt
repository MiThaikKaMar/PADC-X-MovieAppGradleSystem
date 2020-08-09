package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DetailVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PopularMovieApi {

    @GET(GET_POPULAR)
    fun getAllPopularMovie(@Query(PARAM_API_KEY)apiKey : String) : Observable<GetPopularResponses>

    @GET(GET_GENRE_MOVIE)
    fun getGenreMovie(@Query(PARAM_API_KEY)apiKey: String) : Observable<GetGenreMovieResponses>

    @GET(GET_SHOWCASE)
    fun getAllShowcase(@Query(PARAM_API_KEY)apiKey: String) : Observable<GetShowcaseResponses>

    @GET(GET_BEST_ACTOR)
    fun getAllBestActor(@Query(PARAM_API_KEY)apiKey: String) : Observable<GetBestActorResponses>

    @GET(GET_DISCOVER)
    fun getDiscover(@Query(PARAM_API_KEY)apiKey: String,@Query(PARAM_KEY)withGenres : Int) : Observable<GetDiscoverResponses>

    @GET(GET_DETAIL)
    fun getDetail(@Path("movie_id")movieId: Int,@Query(PARAM_API_KEY)apiKey: String):Observable<DetailVO>

    @GET(GET_VIDEO)
    fun getVideo(@Path("MOVIE_ID")movieId: Int,@Query(PARAM_API_KEY)apiKey: String) : Observable<GetVideoResponses>

    @GET(GET_TOP_RATED)
    fun getTopRated(@Query(PARAM_API_KEY)apiKey: String) : Observable<GetTopRatedResponses>

    @GET(GET_CREDIT)
    fun getCredit(@Path("MOVIE_ID")movieId: Int,@Query(PARAM_API_KEY)apiKey: String) : Observable<GetCreditResponses>
}