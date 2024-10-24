package com.example.qta2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        //supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        //supportActionBar!!.title = "Iniciar sesión"

        val botonInciosesion = findViewById<Button>(R.id.button2)

        botonInciosesion.setOnClickListener {
            val intent = Intent(this,SeccionesActivity::class.java)
            startActivity(intent)
        }
    }
}