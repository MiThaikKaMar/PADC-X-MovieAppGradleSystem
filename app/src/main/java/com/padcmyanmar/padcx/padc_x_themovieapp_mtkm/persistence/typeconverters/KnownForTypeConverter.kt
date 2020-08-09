package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.KnownForVO


class KnownForTypeConverter {
    @TypeConverter
    fun toString(knownForList : ArrayList<KnownForVO>?) : String{
        knownForList.let {
            return Gson().toJson(knownForList)
        }
        return ""
    }

    @TypeConverter
    fun toKnownForList(knownForListJsonString : String?) : ArrayList<KnownForVO>{
        knownForListJsonString?.let {
            val knownForListType= object : TypeToken<ArrayList<KnownForVO>>(){}.type
            return Gson().fromJson(knownForListJsonString,knownForListType)
        }
        return arrayListOf()
    }
}