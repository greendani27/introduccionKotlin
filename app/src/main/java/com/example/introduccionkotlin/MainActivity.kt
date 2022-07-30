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

        var a: Int = 5 + 5
        val b:Int = 10 - 2
        val c:Int = 3 * 4
        val d:Int = 10 / 5
        val e:Int = 10 % 3
        val f:Int = 10 / 6

        var aPreIncremento: Int = 5
        var bPreDecremento: Int = 5
        var cPostIncremento: Int = 5
        var dPostDecremento: Int = 5

        println(aPreIncremento)
        println(++aPreIncremento)
        println(aPreIncremento)


        println(bPreDecremento)
        println(--bPreDecremento)
        println(bPreDecremento)

        println(cPostIncremento)
        println(cPostIncremento++)
        println(cPostIncremento)

        println(dPostDecremento)
        println(dPostDecremento--)
        println(dPostDecremento)

    }
}