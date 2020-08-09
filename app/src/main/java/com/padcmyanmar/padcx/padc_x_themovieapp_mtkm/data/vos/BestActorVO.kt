package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.persistence.typeconverters.KnownForTypeConverter

@Entity(tableName = "best_actor_entity")
@TypeConverters(KnownForTypeConverter::class)
data class BestActorVO (
    @SerializedName("popularity")var popularity : String? ="",
    @SerializedName("known_for_department")var knownForDepartment : String? ="",
    @SerializedName("gender")var gender :String? ="",
    @PrimaryKey
    @SerializedName("id")var id : Int=0,
    @SerializedName("profile_path")var profilePath : String? = "",
    @SerializedName("adult")var adult :String? ="",
    @SerializedName("known_for")var knownFor : ArrayList<KnownForVO>? = arrayListOf(),
    @SerializedName("name")var name : String? =""
)
