fun testaComportamentosConta() {

    val contaAlex = ContaPoupanca("Alex", 19284)
    contaAlex.deposita(200.0)

    val contaFran = ContaCorrente("Fran", 39033)
    contaFran.deposita(300.0)
}