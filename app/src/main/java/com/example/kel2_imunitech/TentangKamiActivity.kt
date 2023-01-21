package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kel2_imunitech.databinding.ActivityHomeBinding
import com.example.kel2_imunitech.databinding.ActivityTentangKamiBinding

class TentangKamiActivity : AppCompatActivity() {
    lateinit var binding: ActivityTentangKamiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTentangKamiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        menuNavbar()
    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@TentangKamiActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@TentangKamiActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@TentangKamiActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@TentangKamiActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@TentangKamiActivity, TentangKamiActivity::class.java)
            startActivity(intent)
        }

    }
}