package com.example.kotlinlearning



class Jogador{

    var kart = ""
    var pneu = ""
    var planador = ""


    fun acelerar(aceleracao: Int = 0){
        println("Acelera")
    }

//    fun powerup(): String{
//        return "Casca de Banana"
//    }
    fun powerup(): String = "Casca de Banana"

}

fun main() {

    val jogador = Jogador()
//    jogador.pneu = "pneu macio"
//    jogador.kart = "kart do mario"
//    jogador.planador = "asa delta"
    val poder = jogador.powerup()
//    jogador.acelerar(80)


}