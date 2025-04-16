package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityConfiguracion2Binding

class Configuracion2 : AppCompatActivity() {

    private lateinit var binding: ActivityConfiguracion2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfiguracion2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolver.setOnClickListener {
            startActivity(Intent(this, muestra_maquinas2::class.java))
        }

    }
}