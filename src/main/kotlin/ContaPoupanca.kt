class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}