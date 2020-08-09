package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.GenresVO

class GenresTypeConverter {
    @TypeConverter
    fun toString(genresList : ArrayList<GenresVO>?) : String{
        genresList?.let {
            return Gson().toJson(genresList)
        }
        return ""
    }

    @TypeConverter
    fun toGenresList(genresListJsonString : String?) : ArrayList<GenresVO>{
        genresListJsonString?.let {
            val genresListType= object : TypeToken<ArrayList<GenresVO>>(){}.type
            return Gson().fromJson(genresListJsonString,genresListType)
        }
        return arrayListOf()
    }
}