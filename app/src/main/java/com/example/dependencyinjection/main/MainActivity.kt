package com.example.dependencyinjection.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.dependencyinjection.R
import com.example.dependencyinjection.clases.B
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    private lateinit var nombre: EditText
    private lateinit var saludame: Button
    private lateinit var claseA: TextView
    private lateinit var claseB: TextView
    private lateinit var claseC: TextView
    private lateinit var claseD: TextView
    private lateinit var claseE: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.nombre)
        saludame = findViewById(R.id.saludame)
        claseA = findViewById(R.id.claseA)
        claseB = findViewById(R.id.claseB)
        claseC = findViewById(R.id.claseC)
        claseD = findViewById(R.id.claseD)
        claseE = findViewById(R.id.claseE)

        subscribeClaseA()
        subscribeClaseC()
        subscribeClaseD()
        subscribeClaseE()

        saludame.setOnClickListener {
            nombre.text?.toString()?.also { name ->
                claseB.text = B(name).despideme()
            }
        }
    }
    private fun subscribeClaseA() = mainViewModel.saludoA.observe(this, Observer { saludo ->
        claseA.text = saludo
    })
    private fun subscribeClaseC() = mainViewModel.saludoC.observe(this, Observer {
        claseC.text = it
    })
    private fun subscribeClaseD() = mainViewModel.saludoYdespedidaD.observe(this, Observer {
        claseD.text = it
    })
    private fun subscribeClaseE() = mainViewModel.saludoYDespedidaE.observe(this, Observer {
        claseE.text = it
    })
}