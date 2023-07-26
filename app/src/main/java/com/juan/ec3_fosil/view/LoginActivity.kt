package com.juan.ec3_fosil.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.juan.ec3_fosil.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()
    }

    private fun setupViews() {
        binding.tilEmail.editText?.addTextChangedListener {text ->
            binding.btnlogin.isEnabled = validateInputs(text.toString(), binding.tilPassword.editText?.text.toString())
        }
        binding.tilPassword.editText?.addTextChangedListener {text ->
            binding.btnlogin.isEnabled = validateInputs( binding.tilEmail.editText?.text.toString(),text.toString() )
        }

        binding.btnlogin.setOnClickListener{
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"Login iniciado", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateInputs(email: String, password: String ): Boolean{
        val isEmailOk = email.isNotEmpty() && email.equals("ejemplo@idat.edu.pe")
        val isPasswordOk = password.length == 6 && password.equals("123456")
        return isPasswordOk && isEmailOk
    }



}