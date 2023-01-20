package com.example.kel2_imunitech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kel2_imunitech.RetrofitModelDataAnak.view.DataAnakListAdapter
import com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel.DataAnakViewModel
import kotlinx.android.synthetic.main.activity_list_anak.*

class ListAnakActivity : AppCompatActivity() {

    lateinit var viewModel: DataAnakViewModel
    private val photoListAdapter = DataAnakListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_anak)

        viewModel = ViewModelProvider(this).get(DataAnakViewModel::class.java)
        viewModel.fetchData()

        rv_list_anak.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()
    }
    fun observeViewModel() {
        viewModel.dataAnakArr.observe(this, Observer { photos ->
            photos?.let {
                photoListAdapter.updateDataAnaks(it)
            }
        })
    }
}
