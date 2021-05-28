fun testaCondicoes(saldo: Double) {
    // Estruturas condicionais
    if (saldo > 0.0) {
        println("br.com.bytebank.modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.bytebank.modelo.Conta é neutra")
    } else {
        println("br.com.bytebank.modelo.Conta é negattiva")
    }

    // tipo o switch
    when {
        saldo > 0.0 -> println("br.com.bytebank.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.bytebank.modelo.Conta é neutra")
        else -> println("br.com.bytebank.modelo.Conta é negattiva")
    }
}