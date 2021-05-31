import br.com.bytebank.modelo.*

fun testaComportamentosConta() {

    val alex = Cliente ("Alex", "", Endereco(), 1)
    val fran = Cliente("Fran", "4856", Endereco(), 1)
    val contaAlex = ContaPoupanca(alex, 19284)
    contaAlex.deposita(200.0)

    val contaFran = ContaCorrente(fran, 39033)
    contaFran.deposita(300.0)

    try {
        contaFran.transfere(300.0, contaAlex,1)
        println("Transferencia sucedida")

    }catch(e : SaldoInsuficenteException){
        println("Falha na transferencia")
        println(e.message)
    }
    catch(e: FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na autenticacao")
    }
    catch(e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }


}