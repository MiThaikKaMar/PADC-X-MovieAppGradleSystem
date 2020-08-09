package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.ProductionCompaniesVO

class ProductionCompaniesTypeConverter {
    @TypeConverter
    fun toString(productionCompaniesList : ArrayList<ProductionCompaniesVO>?) : String{
        productionCompaniesList?.let {
            return Gson().toJson(productionCompaniesList)
        }
        return ""
    }

    @TypeConverter
    fun toProductionCompaniesList(productionCompaniesListJsonString : String?) : ArrayList<ProductionCompaniesVO>{
        productionCompaniesListJsonString?.let {
            val productionCompaniesListType= object : TypeToken<ArrayList<ProductionCompaniesVO>>(){}.type
            return Gson().fromJson(productionCompaniesListJsonString,productionCompaniesListType)
        }
        return arrayListOf()
    }
}