package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "EUR"
    }

    var saldo: Float = 300.54f
    var sueldo = 764.82f
    var entero: Int = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "25/06/2002"
        var nombre: String = "dani"
        var vip: Boolean = false
        var inicial: Char = 'J'

        var saludo = "hola $nombre"

        println(saludo)

    }
}