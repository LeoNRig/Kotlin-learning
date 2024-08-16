package com.example.kotlinlearning

interface Presidenciavel {
    fun candidatarSe()
}

abstract class Pessoa{
    fun comer() = println("comer")
//    abstract fun candidatarSe()
}

class DesenvolvedorAndroid: Pessoa(){
    fun programar() = println("programar")
}
class DesenvolvedorWeb: Pessoa(){
    fun programar() = println("programar")
}
class Piloto: Pessoa(){

}
class Jornalista: Pessoa(), Presidenciavel {
    fun escreverNoticia() = println("Escrever Noticia")
    override fun candidatarSe() {
        println("Pode se candidatar")
    }
}
class Contador: Pessoa(){

}
fun main() {

    val desenvolvedorandroid = DesenvolvedorAndroid()
    desenvolvedorandroid.comer()

    println("---------")

    val jornalista = Jornalista()
    jornalista.comer()

}