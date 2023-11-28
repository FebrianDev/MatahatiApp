package com.febrian.matahatiapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.febrian.matahatiapp.databinding.ActivityMainBinding
import com.google.android.material.chip.Chip
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chip1.isChecked = true
      //  binding.chip1.isActivated = true

        binding.chip1.setOnClickListener {
            Toast.makeText(applicationContext, binding.chip1.text.toString(), Toast.LENGTH_SHORT).show()

            binding.chip1.isChecked = true
          //  binding.chip1.isActivated = true

            binding.chip3.isChecked = false
           // binding.chip3.isActivated = false

            binding.chip2.isChecked = false
          //  binding.chip2.isActivated = false
        }

        binding.chip2.setOnClickListener {
            Toast.makeText(applicationContext, binding.chip2.text.toString(), Toast.LENGTH_SHORT).show()

            binding.chip1.isChecked = false
          //  binding.chip1.isActivated = false

            binding.chip2.isChecked = true
         //   binding.chip2.isActivated = true

            binding.chip3.isChecked = false
       //     binding.chip3.isActivated = false
        }

        binding.chip3.setOnClickListener {
            Toast.makeText(applicationContext, binding.chip3.text.toString(), Toast.LENGTH_SHORT).show()
            binding.chip1.isChecked = false
           // binding.chip1.isActivated = false

            binding.chip2.isChecked = true
         //   binding.chip2.isActivated = true

            binding.chip2.isChecked = false
         //   binding.chip2.isActivated = false
        }


    }
}