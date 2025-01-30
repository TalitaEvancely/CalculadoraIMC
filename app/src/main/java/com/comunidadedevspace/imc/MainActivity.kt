package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        btnCalcular.setOnClickListener {

            val pesoStr:String = edtPeso.text.toString()
            val alturaStr:String = edtAltura.text.toString()

            if(pesoStr == "" || alturaStr == ""){
                //mostrar mensagem para o usuário
                Snackbar
                    .make(
                    edtPeso,
                    "Preencha os campos solicitados",
                    Snackbar.LENGTH_LONG
                ).show()
            } else{
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2


           val intent = Intent(this,ResultActivity::class.java)

                intent.putExtra( KEY_RESULT_IMC,resultado) //CHAVE QUE LIGA O RESULTADO AS DUAS TELAS

           startActivity(intent)

            println("Calculo IMC = " + resultado)

                /* Cores
                 - EditText background + icones
                 - Grandiente + icones + títulos + descrição


                * */
        }
        }
    }
}