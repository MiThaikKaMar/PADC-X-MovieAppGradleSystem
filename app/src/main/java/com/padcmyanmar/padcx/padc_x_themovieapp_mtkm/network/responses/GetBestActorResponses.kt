package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.BestActorVO

data class GetBestActorResponses (
    @SerializedName("page")val page : String? ="",
    @SerializedName("total_result")val totalResult : String? ="",
    @SerializedName("total_pages")val totalPages : String? ="",
    @SerializedName("results")val results : ArrayList<BestActorVO>? = arrayListOf()
)