package com.santi.appregistro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById<Button>(R.id.idBtn)
        btn.setOnClickListener{onClick()}
    }

    private fun onClick() {

        val direccionTXT: EditText = findViewById(R.id.idDireccion)
        val direccion: String = direccionTXT.text.toString()
        Toast.makeText( this, "Dirección: $direccion", Toast.LENGTH_SHORT).show()

        val telefonoTXT: EditText = findViewById(R.id.idTelefono)
        val telefono: String = telefonoTXT.text.toString()
        Toast.makeText( this, "Teléfono: $telefono", Toast.LENGTH_SHORT).show()

        val correoTXT: EditText = findViewById(R.id.idCorreo)
        val correo: String = correoTXT.text.toString()
        Toast.makeText( this, "Correo: $correo", Toast.LENGTH_SHORT).show()

        val documentoTXT: EditText = findViewById(R.id.idDocumento)
        val documento: String = documentoTXT.text.toString()
        Toast.makeText( this, "Documento: $documento", Toast.LENGTH_SHORT).show()

        val edadTXT: EditText = findViewById(R.id.idEdad)
        val edad: Int = edadTXT.text.toString().toInt()
        Toast.makeText( this, "Edad: $edad", Toast.LENGTH_SHORT).show()

        val resultadoTXT: TextView = findViewById(R.id.idResultado)
        resultadoTXT.text = "Resultado:\n $direccion \n $telefono\n $correo\n $documento\n $edad años"

        val resultadoEdadTXT: TextView = findViewById(R.id.idEdadTXT)

        if (edad < 0){
            resultadoEdadTXT.text = "No puede ingresar numeros menores a 0"
        }else if (edad >= 0 && edad <= 15) {
            resultadoEdadTXT.text = "$edad años - usted es Infante"
        }else if (edad > 15 && edad <= 18){
            resultadoEdadTXT.text = "$edad años - usted es Adolescente"
        }else if (edad > 18 && edad <= 65){
            resultadoEdadTXT.text = "$edad años - usted es Adulto"
        }else if (edad > 65){
            resultadoEdadTXT.text = "$edad años - usted es Adulto mayor"
        }




    }
}