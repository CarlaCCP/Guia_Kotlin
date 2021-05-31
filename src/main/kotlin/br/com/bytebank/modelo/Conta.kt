package br.com.bytebank.modelo




abstract class Conta(
    val titular: Cliente, // composição
    val numero: Int
) : Autenticavel {

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
    init {
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
       return titular.autentica((senha))
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun sacar(valor: Double)


    fun transfere(valor: Double, destino: Conta, senha: Int) {

        if (saldo < valor) {
            throw SaldoInsuficenteException("Saldo insuficente teste")
        }

        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)


    }


}