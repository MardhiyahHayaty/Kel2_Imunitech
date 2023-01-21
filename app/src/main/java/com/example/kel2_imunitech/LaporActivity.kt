package com.example.kel2_imunitech

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kel2_imunitech.databinding.ActivityLayoutLaporBinding
import com.example.kel2_imunitech.databinding.ActivityMasukBinding


class LaporActivity : AppCompatActivity() {

    lateinit var binding: ActivityLayoutLaporBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLayoutLaporBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnKirim.setOnClickListener {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }

        menuNavbar()

    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@LaporActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@LaporActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@LaporActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@LaporActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@LaporActivity, TentangKamiActivity::class.java)
            startActivity(intent)
        }

    }
}