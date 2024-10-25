package com.example.primeiroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciando os elementos do layout
        val editTextNumber: EditText = findViewById(R.id.editTextNumber)
        val buttonCalculate: Button = findViewById(R.id.buttonCalculate)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        // Definindo a ação para o clique do botão
        buttonCalculate.setOnClickListener {
            // Obtendo o valor inserido pelo usuário
            val input = editTextNumber.text.toString().toDoubleOrNull() ?: 0.0 // Operador Elvis protegendo de nulos
            val result = input * 2 // Calculando
            textViewResult.text = "O dobro é: $result" // Exibindo o resultado no TextView
        }
    }
}