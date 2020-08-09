package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*

@Dao
interface PopularMovieDao {

    @Query("SELECT * FROM popularMovies")
    fun getAllPopularMovie(): LiveData<List<PopularMovieVO>>


    @Query("SELECT * FROM popularMovies WHERE :id")
    fun getPopularMovieById(id : Int) : LiveData<PopularMovieVO>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPopularMovieList(movieList : List<PopularMovieVO>)

    @Insert
    fun insertPopularMove(popularMovie : PopularMovieVO)

    @Query("SELECT * FROM best_actor_entity")
    fun getAllBestActor(): LiveData<List<BestActorVO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setBestActor(list : List<BestActorVO>)
//
//    @Query("SELECT * FROM detail_entity WHERE :id")
//    fun getDetail(id : Int) : LiveData<DetailVO>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun setDetail(detail: DetailVO)

    @Query("SELECT * FROM discover_entity WHERE genreIds in (:withGenre)")
    fun getAllDiscover(withGenre : Int):LiveData<List<DiscoverVO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setDiscover(list: List<DiscoverVO>)

    @Query("SELECT * FROM genre_movie")
    fun getGenreMovieList() : List<GenreMovieVO>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setGenreMovieList(genreList : List<GenreMovieVO>)

    @Query("SELECT * FROM showcase_entity")
    fun getAllShowcase() : LiveData<List<ShowcaseVO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setShowcase(list: List<ShowcaseVO>)

    @Query("SELECT * FROM video_entity")
    fun getVideo() : LiveData<List<VideoVO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setVideo(video : List<VideoVO>)

    @Query("SELECT * FROM top_rated_entity")
    fun getTopRatedList() : LiveData<List<TopRateVO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setTopRatedList(list : List<TopRateVO>)
}