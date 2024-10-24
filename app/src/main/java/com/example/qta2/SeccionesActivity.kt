package com.example.qta2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.qta2.databinding.ActivityMainBinding
import com.example.qta2.databinding.ActivitySeccionesBinding


class SeccionesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeccionesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySeccionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        replaceFragment(Buscar())
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.buscar -> replaceFragment(Buscar())
                R.id.rutas -> replaceFragment(Rutas())
                R.id.perfil -> replaceFragment(Perfil())
            }
            true
        }

    }
    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()


    }


}


