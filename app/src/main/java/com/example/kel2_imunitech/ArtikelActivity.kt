package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kel2_imunitech.databinding.ActivityArtikelBinding
import com.example.kel2_imunitech.databinding.ActivityListArtikelBinding

class ArtikelActivity : AppCompatActivity() {
    lateinit var binding: ActivityListArtikelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListArtikelBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        menuNavbar()
    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@ArtikelActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@ArtikelActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@ArtikelActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@ArtikelActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@ArtikelActivity, TentangKamiActivity::class.java)
            startActivity(intent)
        }

    }
}