abstract class Conta(
    val titular: String,
    val numero: Int
) {

    var saldo = 0.0
        protected set // somente a classe e suas filhas podem mexer

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