import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun testaComportamentosConta() {

    val alex = Cliente ("Alex", "", Endereco(), 1)
    val fran = Cliente("Fran", "4856", Endereco(), 1)
    val contaAlex = ContaPoupanca(alex, 19284)
    contaAlex.deposita(200.0)

    val contaFran = ContaCorrente(fran, 39033)
    contaFran.deposita(300.0)
}