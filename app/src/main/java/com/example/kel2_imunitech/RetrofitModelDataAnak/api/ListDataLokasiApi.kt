package com.example.kel2_imunitech.RetrofitModelDataAnak.api

import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataLokasi
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers

interface ListDataLokasiApi {
    @Headers("ngrok-skip-browser-warning: 69420", "Content-Type: application/json")
    @GET("DataLokasis")
    fun getDataLokasis(): Single<List<DataLokasi>>
}