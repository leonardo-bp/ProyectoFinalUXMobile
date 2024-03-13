package com.example.proyectofinaluxmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class BetPlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bet_play)

        val conectarButtonBetPlay: Button = findViewById(R.id.conectarButtonBetPlay)

        conectarButtonBetPlay.setOnClickListener {
            val intent = Intent(this, LigaActivity::class.java)
            startActivity(intent)
        }

        val backButtonBetPlay: ImageView = findViewById(R.id.backButtonBetPlay)

        backButtonBetPlay.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        val homeImageViewBetPlay: ImageView = findViewById(R.id.homeImageViewBetPlay)

        homeImageViewBetPlay.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }
    }
}