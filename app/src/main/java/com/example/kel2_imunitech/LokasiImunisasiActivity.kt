package com.example.kel2_imunitech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kel2_imunitech.RetrofitModelDataAnak.view.DataAnakListAdapter
import com.example.kel2_imunitech.RetrofitModelDataAnak.view.DataLokasiListAdapter
import com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel.DataAnakViewModel
import com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel.DataLokasiViewModel
import kotlinx.android.synthetic.main.activity_list_anak.*
import kotlinx.android.synthetic.main.activity_list_lokasi_imunisasi.*

class LokasiImunisasiActivity : AppCompatActivity() {

    lateinit var viewModel: DataLokasiViewModel
    private val photoListAdapter = DataLokasiListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_lokasi_imunisasi)

        viewModel = ViewModelProvider(this).get(DataLokasiViewModel::class.java)
        viewModel.fetchData()

        rv_list_lokasi_imunisasi.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()
    }
    fun observeViewModel() {
        viewModel.dataLokasiArr.observe(this, Observer { photos ->
            photos?.let {
                photoListAdapter.updateDataLokasis(it)
            }
        })
    }
}