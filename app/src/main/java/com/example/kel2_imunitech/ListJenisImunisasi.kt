package com.example.kel2_imunitech

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kel2_imunitech.databinding.ActivityLayoutJenisImunisasiBinding
import com.example.kel2_imunitech.databinding.ActivityListJenisImunisasiBinding
import kotlinx.android.synthetic.main.activity_list_jenis_imunisasi.*

class ListJenisImunisasi: AppCompatActivity(){
    lateinit var binding: ActivityLayoutJenisImunisasiBinding
    private lateinit var jenisImunisasiAdapter: JenisImunisasiRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLayoutJenisImunisasiBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_jenis_imunisasi)
        initRecyclerView()
        tambahDataSet()

        binding.ikonDetail.setOnClickListener {
            val intent = Intent(this@ListJenisImunisasi, DetailImunisasi::class.java)
            startActivity(intent)
        }
    }

    private fun tambahDataSet() {
        val data = SumberData.buatSetData()
        jenisImunisasiAdapter.submitList(data)
        print(jenisImunisasiAdapter)
    }

    private fun initRecyclerView() {
        //val recycler_view = RecyclerView(this@ListJenisImunisasi)
        rv_list_jenis_imunisasi.apply{
            layoutManager = LinearLayoutManager(this@ListJenisImunisasi)
            jenisImunisasiAdapter = JenisImunisasiRecyclerAdapter()
            adapter = jenisImunisasiAdapter
        }
    }
}