package com.example.kel2_imunitech.RetrofitModelDataAnak.api

import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataLokasi
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DataLokasiService {
    private val BASE_URL = "https://998a-2001-448a-1082-c519-e853-6110-6457-97a7.ap.ngrok.io/api/"
    private val api: ListDataLokasiApi

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(ListDataLokasiApi::class.java)
    }

    fun getDataLokasis(): Single<List<DataLokasi>> {
        return api.getDataLokasis()
    }
}