package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ProductionCountriesVO

class ProductionCountriesTypeConverter {
    @TypeConverter
    fun toString(productionCountriesList : ArrayList<ProductionCountriesVO>?) : String{
        productionCountriesList?.let {
            return Gson().toJson(productionCountriesList)
        }
        return ""
    }

    @TypeConverter
    fun toProductionCountriesList(productionCountriesListJsonString : String?) : ArrayList<ProductionCountriesVO>{
        productionCountriesListJsonString?.let {
            val productionCountriesListType= object : TypeToken<ArrayList<ProductionCountriesVO>>(){}.type
            return Gson().fromJson(productionCountriesListJsonString,productionCountriesListType)
        }
        return arrayListOf()
    }
}