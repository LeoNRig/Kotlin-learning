package com.example.kotlinlearning

class Produto{

    lateinit var descricao: String

}

fun main() {

    val produto = Produto()
    produto.descricao = "Notebook"
    println(produto.descricao)

}