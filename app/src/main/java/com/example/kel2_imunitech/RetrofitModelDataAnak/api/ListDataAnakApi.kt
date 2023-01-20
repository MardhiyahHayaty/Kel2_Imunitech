package com.example.kel2_imunitech.RetrofitModelDataAnak.api

import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface ListDataAnakApi {
    @Headers("ngrok-skip-browser-warning: 69420", "Content-Type: application/json")
    @GET("DataAnaks")
    fun getDataAnaks(): Single<List<DataAnak>>
}