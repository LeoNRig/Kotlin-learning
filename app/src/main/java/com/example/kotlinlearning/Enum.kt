package com.example.kotlinlearning

//    aguardando informação
//    pedido_realizado,pagamento-confirmado
//    pedido_entrege, pedido_enviado

enum class StatusPedido{
    PEDIDO_REALIZADO,
    AGUARDANDO_APROVACAO,
    PEDIDO_ENVIADO,
    PAGAMENTO_APROVADO,
    PEDIDO_ENTREGUE

}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
){



}

fun main() {
// Tela de Compra

    val pedido = Pedido(125.90,"Ryzen 2")

// Pagamento pelo cartão

    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

//    Trasnportadora

//    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO

    println("StatusPedido ${StatusPedido.PEDIDO_ENVIADO.ordinal}")



//    Histórico de compras

    if(pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("O seu pedido foi realizado")
    }else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
        println("O seu pedido foi aprovado")
    }else if (pedido.statusPedido == StatusPedido.PAGAMENTO_APROVADO){
        println("Pagamento aprovado")
    }


}