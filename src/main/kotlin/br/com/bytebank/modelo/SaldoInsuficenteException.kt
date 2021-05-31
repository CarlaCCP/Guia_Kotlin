package br.com.bytebank.modelo

import java.lang.Exception

class SaldoInsuficenteException(mensagem: String = "O saldo é insuficiente") :
    Exception(mensagem) {
}