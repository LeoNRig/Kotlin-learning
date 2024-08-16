package com.example.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto= findViewById(R.id.textView)
        texto.setText("Inicial")

    }

    fun alternarTexto() {
        texto.setText("alterado")
    }
}