package com.example.kotlinlearning

fun main() {

//    var nome = arrayOf(
//        "Leonardo", "Ana"
//    )
//    nome = arrayOf(
//        "teste"
//    )
//
////    nome[0] = "mudou"
//
//    println( nome[0] )
//    var numero = 1
//    while (numero <= 5 ){
//        println("Executou: $numero")
//        numero++
//    }
//    for (numero in 1..5){
//        println("Executou $numero")
//    }
    val postagens = arrayOf(
        "Viagens",
        "Cachorro",
        "Trilha"
    )
//    for (postagem in postagens){
//        println("titulo $postagem")
//    }
    for ((indice, postagem) in postagens.withIndex()){
       println("titulo $postagem")
      }

}