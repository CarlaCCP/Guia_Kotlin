package br.com.bytebank.modelo

import java.lang.Exception

class FalhaAutenticacaoException (
    mensagem: String = "Falha na autenticação"
        ) : Exception(mensagem)
