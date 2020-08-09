package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models

import android.content.Context
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.PopularMovieApi
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.db.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BaseModel {

    protected var mPopularMovieApi : PopularMovieApi
    protected lateinit var mPopularDB : PopularMovieDB


    init {
        val mOkHttpClient = OkHttpClient.Builder()
            .connectTimeout(15,TimeUnit.SECONDS)
            .readTimeout(15,TimeUnit.SECONDS)
            .writeTimeout(15,TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        mPopularMovieApi=retrofit.create(PopularMovieApi::class.java)
    }

    fun initDatabase(context: Context){
        mPopularDB= PopularMovieDB.newDBInstance(context)
    }

}