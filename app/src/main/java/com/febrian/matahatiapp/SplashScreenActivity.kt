package com.febrian.matahatiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febrian.matahatiapp.databinding.ActivitySplashScreenBinding
import splitties.activities.start

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            start<LoginActivity>()
        }
    }
}