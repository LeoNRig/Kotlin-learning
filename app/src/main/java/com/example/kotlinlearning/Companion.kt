package com.example.kotlinlearning


class Carro2(
    var modelo: String = "",
    var velocidade: Int = 0
){

    companion object{
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirMensagemVelocidadeMaxima(){
            println("Velocidade maxima permitida é: $VELOCIDADE_MAX_PERMITIDA")
        }

    }

    fun exibirInformacao(){
        println("Informações $modelo e a velociadade $velocidade")
    }

}

class Usuario {

    companion object {
        fun verificarLogado(): Boolean {

            return true
        }


    }
}

fun main() {

    val retorno = Usuario.verificarLogado()
    println("Logado como: $retorno")
//    println("Velocidade maxima permitida: ${Carro2.VELOCIDADE_MAX_PERMITIDA}")
//
//    val fusca = Carro2("Fusca", 100)
//    fusca.exibirInformacao()
//    Carro2.exibirMensagemVelocidadeMaxima()
//
//
//    val ferrari = Carro2("Ferrari", 200)
//    ferrari.exibirInformacao()

//    println("PI: ${Math.PI}")

}