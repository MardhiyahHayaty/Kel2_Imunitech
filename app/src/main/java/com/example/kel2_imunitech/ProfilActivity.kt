package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kel2_imunitech.databinding.ActivityHomeBinding
import com.example.kel2_imunitech.databinding.ActivityLayoutLaporBinding
import com.example.kel2_imunitech.databinding.ActivityProfilBinding

class ProfilActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        menuNavbar()
    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@ProfilActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@ProfilActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@ProfilActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@ProfilActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@ProfilActivity, TentangKamiActivity::class.java)
            startActivity(intent)
        }

    }
}