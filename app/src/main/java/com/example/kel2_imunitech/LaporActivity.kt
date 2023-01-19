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

    }
}