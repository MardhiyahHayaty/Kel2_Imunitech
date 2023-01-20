package com.example.kel2_imunitech.RetrofitModelDataAnak.api

import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DataAnakService {
    private val BASE_URL = "https://998a-2001-448a-1082-c519-e853-6110-6457-97a7.ap.ngrok.io/api/"
    private val api: ListDataAnakApi

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(ListDataAnakApi::class.java)
    }

    fun getDataAnaks(): Single<List<DataAnak>> {
        return api.getDataAnaks()
    }
}