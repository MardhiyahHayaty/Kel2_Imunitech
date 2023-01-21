package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kel2_imunitech.RetrofitModelDataAnak.view.DataAnakListAdapter
import com.example.kel2_imunitech.RetrofitModelDataAnak.viewmodel.DataAnakViewModel
import com.example.kel2_imunitech.databinding.ActivityListAnakBinding
import kotlinx.android.synthetic.main.activity_list_anak.*

class ListAnakActivity : AppCompatActivity() {

    lateinit var viewModel: DataAnakViewModel
    private val photoListAdapter = DataAnakListAdapter(arrayListOf())
    lateinit var binding: ActivityListAnakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListAnakBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_anak)

        viewModel = ViewModelProvider(this).get(DataAnakViewModel::class.java)
        viewModel.fetchData()

        rv_list_anak.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()

        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this@ListAnakActivity, ListAnakActivity::class.java)
            startActivity(intent)
        }
    }
    fun observeViewModel() {
        viewModel.dataAnakArr.observe(this, Observer { photos ->
            photos?.let {
                photoListAdapter.updateDataAnaks(it)
            }
        })
    }
}
