package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.BelongToCollectionVO

class BelongToTypeConverter {
    @TypeConverter
    fun toString(list : BelongToCollectionVO?) : String{
        list?.let {
            return Gson().toJson(list)
        }
        return ""
    }

    @TypeConverter
    fun toList(listJsonString : String?) : BelongToCollectionVO{
        listJsonString?.let {
            val listType= object : TypeToken<BelongToCollectionVO>(){}.type
            return Gson().fromJson(listJsonString,listType)
        }
        return BelongToCollectionVO()
    }
}