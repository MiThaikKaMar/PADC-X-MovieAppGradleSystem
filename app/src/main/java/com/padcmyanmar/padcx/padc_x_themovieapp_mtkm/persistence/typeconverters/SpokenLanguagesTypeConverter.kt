package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.SpokenLanguagesVO

class SpokenLanguagesTypeConverter {
    @TypeConverter
    fun toString(spokenLanguagesList : ArrayList<SpokenLanguagesVO>?) : String{
        spokenLanguagesList?.let {
            return Gson().toJson(spokenLanguagesList)
        }
        return ""
    }

    @TypeConverter
    fun toSpokenLanguagesList(spokenLanguagesListJsonString : String?) : ArrayList<SpokenLanguagesVO>{
        spokenLanguagesListJsonString?.let {
            val spokenLanguagesListType= object : TypeToken<ArrayList<SpokenLanguagesVO>>(){}.type
            return Gson().fromJson(spokenLanguagesListJsonString,spokenLanguagesListType)
        }
        return arrayListOf()
    }
}