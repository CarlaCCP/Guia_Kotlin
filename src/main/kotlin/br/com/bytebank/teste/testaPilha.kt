package br.com.bytebank.teste

import br.com.bytebank.modelo.Endereco
import java.lang.ClassCastException

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        try {
            endereco as Endereco
        } catch (e: ClassCastException) {
            println("Pegou classCast")
        }

    }
    println("fim funcao2")
}