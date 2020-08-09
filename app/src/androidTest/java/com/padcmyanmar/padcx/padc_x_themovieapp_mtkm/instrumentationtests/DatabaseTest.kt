package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.instrumentationtests

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.PopularMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.daos.PopularMovieDao
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.db.PopularMovieDB
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DatabaseTest {
    private lateinit var db : PopularMovieDB
    private lateinit var movie_dao : PopularMovieDao

    @Before
    fun createDB(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context,PopularMovieDB::class.java).build()
        movie_dao = db.popularMovieDao()
    }

    @After
    fun closeDB(){
        db.close()
    }

    @Test
    fun databaseTest(){
        var movie = PopularMovieVO()
        movie.id = 1
        movie.popularity="193.5"
        movie.voteCount="2742"
        movie.posterPath="/mb7wQv0adK3kjOUr9n93mANHhPJ.jpg"
        movie.adult="false"

        movie_dao.insertPopularMove(movie)
        assert(movie_dao.getPopularMovieById(movie.id).value?.id == movie.id)
    }
}