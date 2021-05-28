package br.com.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(
    nome,
    cpf,
    salario
) {
    override fun bonificacao(): Double {
      TODO("Not yet implemented")
    }


}