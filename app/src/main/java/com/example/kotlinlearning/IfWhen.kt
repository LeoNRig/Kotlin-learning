package com.example.kotlinlearning

fun main() {
//    val notaAluno = 6
//    val condicao = notaAluno >= 6
//      val opcao = 1

//    if ( opcao == 1 ){
//        println("Cartao de Crédito")
//    }else if(opcao == 2 ){
//        println("Extrato Bancário")
//    }else if(opcao ==3 ){
//        println("Saldo")
//    }else{
//        println("Nenuma opção selecionada")
//    }
    val opcao = 1

//   if ( opcao in 1..3 ){
//        println("Opções selecionadas: 1, 2 e 3")
//  }else if(opcao in 4..8){
//       println("opções selecionadas: 4 até 8")
//   }

    //        println("Cartao de Crédito")
    //        println("Extrato Bancário")
    //        println("Saldo")
    when(opcao){
        1 -> println("Cartao de Crédito")
        2 -> println("Extrato Bancário")
        in 3..5 -> println("Saldo")
        else -> println("Nenuma opção selecionada")
    }

}