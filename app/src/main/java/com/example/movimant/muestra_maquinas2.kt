package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMuestraMaquinas2Binding

class muestra_maquinas2 : AppCompatActivity() {

    private lateinit var binding: ActivityMuestraMaquinas2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMuestraMaquinas2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHome.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.agregarMaquina.setOnClickListener {

            startActivity(Intent(this, registroMaquina2::class.java))
        }
        binding.btnVerPerfil.setOnClickListener {

            startActivity(Intent(this, Configuracion2::class.java))
        }
    }
}