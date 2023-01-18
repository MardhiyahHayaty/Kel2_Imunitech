package com.example.kel2_imunitech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.example.kel2_imunitech.databinding.ActivityDaftarBinding
import com.example.kel2_imunitech.databinding.ActivityMainBinding
import com.example.kel2_imunitech.databinding.ActivityMasukBinding
import com.google.firebase.auth.FirebaseAuth

class MasukActivity : AppCompatActivity() {

    lateinit var binding: ActivityMasukBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMasukBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.linkDaftar.setOnClickListener {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }

        binding.btnMasuk.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val password = binding.edtKataSandi.text.toString()

            //Validasi Email
            if (email.isEmpty()) {
                binding.edtEmail.error = "Email Harus Diisi"
                binding.edtKataSandi.requestFocus()
                return@setOnClickListener
            }
            //Jika email jika salah
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.edtEmail.error = "Email Tidak Valid"
                binding.edtKataSandi.requestFocus()
                return@setOnClickListener
            }

            //Validasi Password
            if (password.isEmpty()) {
                binding.edtEmail.error = "Password Harus Diisi"
                binding.edtKataSandi.requestFocus()
                return@setOnClickListener
            }

            MasukFirebase(email, password)
        }
    }

    private fun MasukFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
            if (it.isSuccessful) {
                Toast.makeText(this, "Selamat Datang $email", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MasukActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}