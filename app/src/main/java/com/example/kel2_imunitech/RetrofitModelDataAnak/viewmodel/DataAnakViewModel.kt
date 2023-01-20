package com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kel2_imunitech.RetrofitModelDataAnak.api.DataAnakService
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class DataAnakViewModel: ViewModel(){
    private val datanakService = DataAnakService()
    private val disposable = CompositeDisposable()
    val dataAnakArr = MutableLiveData<List<DataAnak>>()

    fun fetchData() {
        disposable.add(
            datanakService.getDataAnaks()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<DataAnak>>() {
                    override fun onSuccess(value: List<DataAnak>?) {
                        dataAnakArr.value=value
                        Log.e("errrorrrr",value.toString())
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