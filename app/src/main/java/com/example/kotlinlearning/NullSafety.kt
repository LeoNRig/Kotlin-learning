package com.example.kotlinlearning

class Carro {
    var cor = "vermelho"

    fun acelerar(){

    }

}

fun main() {
    var carro: Carro? = null

    val cor = carro?.cor ?: "cor padrão"

    println(cor)
}