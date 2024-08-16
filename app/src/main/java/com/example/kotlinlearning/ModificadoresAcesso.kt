package com.example.kotlinlearning

open class Carro1{
    private var modelo = ""

    protected open fun injetaGas(){
        println("Injeção de Gás")
    }

    fun acelerar(){
        injetaGas()
        println("Acelerando o carro")
    }
}

class Gol: Carro1(){
    override fun injetaGas() {
        super.injetaGas()
    }

}

class Ferrari: Carro1(){
    override fun injetaGas() {
        super.injetaGas()
    }

}


fun main() {

    /*
    * Uber
    *   - Motorista (App Diferente)
    *   - Passageiro
    * Ifood
    *   - Cliente
    *   - Restaurante
    * */

//    val gol = Gol()
//    gol.acelerar()
//    val carro = Carro1()
//    carro.acelerar()
}