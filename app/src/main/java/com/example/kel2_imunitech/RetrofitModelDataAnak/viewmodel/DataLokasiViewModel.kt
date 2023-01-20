package com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kel2_imunitech.RetrofitModelDataAnak.api.DataAnakService
import com.example.kel2_imunitech.RetrofitModelDataAnak.api.DataLokasiService
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataLokasi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class DataLokasiViewModel: ViewModel(){
    private val datalokasiService = DataLokasiService()
    private val disposable = CompositeDisposable()
    val dataLokasiArr = MutableLiveData<List<DataLokasi>>()

    fun fetchData() {
        disposable.add(
            datalokasiService.getDataLokasis()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<DataLokasi>>() {
                    override fun onSuccess(value: List<DataLokasi>?) {
                        dataLokasiArr.value=value
                        //Log.e("errrorrrr",value.toString())
                    }

                    override fun onError(e: Throwable?) {
                        Log.e("ERRORFETCHDATA", "ërror$e")
                    }
                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}