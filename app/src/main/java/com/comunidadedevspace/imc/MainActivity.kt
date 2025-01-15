package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //R.layout.activity_main busca o layout
        /* Recurar os componentes TextInputLayout
         - Criar uma variavel e associar(=) com o componente de UI <TextInputLayout>
         - Recuperar o botão da tela
         - colocar ação no botão com setOnClickListener
         - recuperar o texto digitado no edt peso
        * */
        val edtPeso = findViewById<TextInputEditText>(R.id.edt_weight)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
        val peso = edtPeso.text
        println("Talita quer saber" + peso)
        }

    }

}