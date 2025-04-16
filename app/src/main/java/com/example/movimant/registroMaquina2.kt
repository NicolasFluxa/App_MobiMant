package com.example.movimant


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityRegistroMaquina2Binding

class registroMaquina2 : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroMaquina2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroMaquina2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener {

            startActivity(Intent(this, muestra_maquinas2::class.java))
        }

    }
}