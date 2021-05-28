package br.com.bytebank.teste

import br.com.bytebank.modelo.*

fun testaObjects() {
    // objeto anonimo - expression
    // quando você quer a estrutura de um objeto sem criar classe
    // consegue ter o msm comportamento de um objeto
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "11111"
        val senha: Int = 1211

        override fun autentica(senha: Int) = this.senha == senha
    }


    val alex = Cliente("Alex", "", Endereco(), 1)
    val contaPoupanca = ContaPoupanca(alex, 1000)

    val carla = Cliente("Carla", "", Endereco(), 1)
    val contaPoupanca2 = ContaPoupanca(carla, 1000)



    println("Total de contas: ${Conta.total}")
}