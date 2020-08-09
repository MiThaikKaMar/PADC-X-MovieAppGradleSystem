package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.daos.PopularMovieDao

@Database(entities = [PopularMovieVO::class, BestActorVO::class, DetailVO::class, DiscoverVO::class, GenreMovieVO::class,ShowcaseVO::class,VideoVO::class,TopRateVO::class], version = 13,exportSchema = false)
abstract class PopularMovieDB : RoomDatabase() {
    companion object{
        val DB_NAME="POPULAR_DB_NAME"
        var dbInstance : PopularMovieDB? =null
        fun newDBInstance(context: Context) : PopularMovieDB{
            when(dbInstance){
                null -> dbInstance=Room.databaseBuilder(context,PopularMovieDB::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            val emptyDBInstance = dbInstance
            return emptyDBInstance!!
        }
    }

    abstract fun popularMovieDao() : PopularMovieDao
}