package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener {

            startActivity(Intent(this, muestra_maquinas2::class.java))
        }
        binding.btnCrearUser.setOnClickListener {

            startActivity(Intent(this, main_mobimant2::class.java))
        }
    }
}