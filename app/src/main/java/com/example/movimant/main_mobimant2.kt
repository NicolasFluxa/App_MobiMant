package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMainMobimant2Binding

class main_mobimant2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainMobimant2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMobimant2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}