private fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(2000.0)

    contaCorrente.sacar(20.0)
    contaPoupanca.sacar(200.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")
}