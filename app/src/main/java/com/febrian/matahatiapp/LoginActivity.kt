package com.febrian.matahatiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febrian.matahatiapp.databinding.ActivityLoginBinding
import splitties.activities.start

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            start<MainActivity>()
            finish()
        }
    }
}