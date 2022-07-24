package com.example.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda = "EUR"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "25/06/2002"
        var nombre = "dani"

        nombre = "Dani"
        //fecha = "25/06/2003"
        println(nombre)

    }
}