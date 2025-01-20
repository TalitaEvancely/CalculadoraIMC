package com.comunidadedevspace.imc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        btnCalcular.setOnClickListener {

            val peso:Float = edtPeso.text.toString().toFloat()
            val altura:Float = edtAltura.text.toString().toFloat()

        }*/
    }
}