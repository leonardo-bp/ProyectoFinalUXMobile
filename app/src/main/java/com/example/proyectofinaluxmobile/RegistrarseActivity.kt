package com.example.proyectofinaluxmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView

class RegistrarseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val loginButtonRegistrarse: Button = findViewById(R.id.loginButtonRegistrarse)

        loginButtonRegistrarse.setOnClickListener {
            val intent = Intent(this, TerminosActivity::class.java)
            startActivity(intent)
        }

        val backButtonRegistrarse: ImageView = findViewById(R.id.backButtonRegistrarse)

        backButtonRegistrarse.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}