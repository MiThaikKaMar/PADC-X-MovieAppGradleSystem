package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm

import android.app.Application
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl

class MovieApp : Application() {

    override fun onCreate() {
        super.onCreate()
        PopularMovieModelImpl.initDatabase(applicationContext)
        PopularMovieModelImpl.getAllMovieFromApiAndSaveDatabase()
    }
}