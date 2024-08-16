package com.example.kotlinlearning

class Usuario1 constructor(
    var nome: String = "",
    var sobrenome: String = ""
){


    init {
//        this.nome = nome
//        this.sobrenome = sobrenome
        println("Objeto Inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }
    constructor(nome: String): this(nome,""){
        println("Construtor Secundario")
    }

}


fun main() {
//    val usuario = Usuario1()
//    usuario.nome = "Leonardo"
//    usuario.sobrenome = "Rigonini"

    val usuario = Usuario1("Leonardo","Rigonini")
    val usuario2 = Usuario1("Leonardo")


}