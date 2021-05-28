import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente("Alex", "", Endereco(), 1),
        numero = 1000
    )


    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Fran", "",Endereco(), 1),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(2000.0)

    contaCorrente.sacar(20.0)
    contaPoupanca.sacar(200.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")
}