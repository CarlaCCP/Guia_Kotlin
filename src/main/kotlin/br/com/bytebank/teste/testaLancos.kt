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