package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.kel2_imunitech.databinding.ActivityDaftarBinding
import com.google.firebase.auth.FirebaseAuth

class DaftarActivity : AppCompatActivity() {

    lateinit var binding: ActivityDaftarBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDaftarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.linkMasuk.setOnClickListener {
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
        }

        binding.btnDaftar.setOnClickListener {
            val email = binding.edtDaftarEmail.text.toString()
            val password = binding.edtDaftarKataSandi.text.toString()

            //Validasi Email
            if (email.isEmpty()) {
                binding.edtDaftarEmail.error = "Email Harus Diisi"
                binding.edtDaftarEmail.requestFocus()
                return@setOnClickListener
            }
            //Jika email jika salah
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.edtDaftarEmail.error = "Email Tidak Valid"
                binding.edtDaftarEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi Password
            if (password.isEmpty()) {
                binding.edtDaftarKataSandi.error = "Password Harus Diisi"
                binding.edtDaftarKataSandi.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang password
            if (password.length < 8) {
                binding.edtDaftarKataSandi.error = "Password Harus Minimal 8 Karakter"
                binding.edtDaftarKataSandi.requestFocus()
                return@setOnClickListener
            }

            DaftarFirebase(email, password)
        }
    }

    private fun DaftarFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                if (it.isSuccessful) {
                    Toast.makeText(this, "Daftar Akun Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MasukActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}