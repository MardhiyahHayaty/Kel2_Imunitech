package com.example.kel2_imunitech

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kel2_imunitech.databinding.ActivityLayoutTentangKamiBinding
import com.example.kel2_imunitech.databinding.ActivityProfilBinding

class TentangActivity : AppCompatActivity() {
    lateinit var binding: ActivityLayoutTentangKamiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLayoutTentangKamiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_tentang_kami)

        menuNavbar()
    }

    private fun menuNavbar(){
        binding.btnHome.setOnClickListener {
            val intent = Intent(this@TentangActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLapor.setOnClickListener {
            val intent = Intent(this@TentangActivity, LaporActivity::class.java)
            startActivity(intent)
        }

        binding.btnArtikel.setOnClickListener {
            val intent = Intent(this@TentangActivity, ListArtikelActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfil.setOnClickListener {
            val intent = Intent(this@TentangActivity, ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.btnTentang.setOnClickListener {
            val intent = Intent(this@TentangActivity, TentangActivity::class.java)
            startActivity(intent)
        }

    }
}