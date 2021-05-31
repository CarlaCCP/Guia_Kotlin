package br.com.bytebank.teste

import java.lang.NumberFormatException

fun testaException() {
    val entrada: String = "1"

    // Try como uma expressão
    // o sinal "?" indica que o double pode receber valor nulo
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    // if também pode ser uma expressão
    val valorComTaxa: Double? = if (valor != null) {
        valor + 0.1
    } else {
        null
    }

    try {
        10 / 0
    } catch (e: ArithmeticException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace()
        println("Exception foi pegada")
    }
}