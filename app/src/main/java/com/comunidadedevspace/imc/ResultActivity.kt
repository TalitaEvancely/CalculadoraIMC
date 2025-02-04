package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

//CRIANDO A CHAVE
const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificação = findViewById<TextView>(R.id.tv_classificacao)


        tvResult.text = result.toString()


        val classificacao: String
        val corTexto: Int

        if (result <= 18.5f) {
            classificacao = "MAGREZA"
            corTexto = Color.GREEN
        } else if (result > 18.5f && result <= 24.9f) {
            classificacao = "NORMAL"
            corTexto = Color.BLUE
        } else if (result > 25f && result <= 29.9f) {
            classificacao = "SOBREPESO"
            corTexto = Color.YELLOW
        } else if (result > 30f && result <= 39.9f) {
            classificacao = "OBESIDADE"
            corTexto = Color.rgb(255, 165, 0) // Laranja
        } else {
            classificacao = "OBESIDADE GRAVE"
            corTexto = Color.RED
        }

        tvClassificação.text = classificacao
        tvClassificação.setTextColor(corTexto)

    }


}


