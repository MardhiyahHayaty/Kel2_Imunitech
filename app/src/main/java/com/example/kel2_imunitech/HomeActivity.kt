package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kel2_imunitech.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        menuButton()
        menuNavbar()
    }

    private fun menuButton(){
        binding.menuDataanak.setOnClickListener {
            val intent = Intent(this@HomeActivity, ListAnakActivity::class.java)
            startActivity(intent)
        }

        binding.menuJenisimunisasi.setOnClickListener {
            val intent = Intent(this@HomeActivity, ListJenisImunisasi::class.java)
            startActivity(intent)
        }

        binding.menuDaftar.setOnClickListener {
            val intent = Intent(this@HomeActivity, FormBookingActivity::class.java)
            startActivity(intent)
        }

        binding.menuRiwayatimunisasi.setOnClickListener {
            val intent = Intent(this@HomeActivity, ListRiwayatImunisasi::class.java)
            startActivity(intent)
        }

        binding.menuLokasiimunisasi.setOnClickListener {
            val intent = Intent(this@HomeActivity, LokasiImunisasiActivity::class.java)
            startActivity(intent)
        }
    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@HomeActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@HomeActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@HomeActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@HomeActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@HomeActivity, TentangKamiActivity::class.java)
            startActivity(intent)
        }

    }
}