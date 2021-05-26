fun main() {
    println("Bem vindo ao ByteBank")

    val contaAlex = Conta("Alex", 19284)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 39033)
    contaFran.deposita(300.0)
}


class Conta(val titular: String, val numero: Int) { //construtor primário
    // por padrão todos os properties vem com get e set
//    var titular = titular
//    var numero = numero
    var saldo = 0.0
        private set//somente os métodos da classe irá alterar o saldo

    // Construtor secundário
    //prefira o contrutor primário, se você só for inicializar os properties
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }
    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    // por padrão retorna um Unit
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo() : Double{
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo = valor
//    }


}

fun testaLancos() {
    // não precisa tipar,graças a deus
    // exige inicialização
    val titular: String = "Carla"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100.0
    saldo += 300.0
    // String template
    println("Titular $titular")
    println("Numero da conta $numeroConta")
    println("Saldo da conta $saldo")

    // Estrutura de repetição - For Loops
    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 5 downTo 1 step 2) {
        println(" $i")
    }

    //cria apenas 4 contas do 1 até 4
    for (i in 1 until 5) {
        //...
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

fun testaCondicoes(saldo: Double) {
    // Estruturas condicionais
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negattiva")
    }

    // tipo o switch
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negattiva")
    }
}
