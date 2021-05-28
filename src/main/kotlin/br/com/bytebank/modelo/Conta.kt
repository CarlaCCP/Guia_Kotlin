package br.com.bytebank.modelo


abstract class Conta(
    val titular: Cliente, // composição
    val numero: Int
) {

    var saldo = 0.0
        protected set // somente a classe e suas filhas podem mexer

    // Object declarations
    // declara que está classe também usará os seus properties, msm que privados
    // não chega na subclasse
    // não precisa colocar o nome "Contador" quando usa o companion
    companion object Contador {
        var total = 0
            private set

    }

    // vai utilizar para carregar coisas já na inicialização
    init{
    println("Criando conta")
    total++
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)


    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }



}