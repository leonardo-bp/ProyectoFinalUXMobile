package com.example.proyectofinaluxmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val betplayButtonInicio: Button = findViewById(R.id.betplayButtonInicio)

        betplayButtonInicio.setOnClickListener {
            val intent = Intent(this, BetPlayActivity::class.java)
            startActivity(intent)
        }

        val cerrarSesionButtonInicio: Button = findViewById(R.id.cerrarSesionButtonInicio)

        cerrarSesionButtonInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}