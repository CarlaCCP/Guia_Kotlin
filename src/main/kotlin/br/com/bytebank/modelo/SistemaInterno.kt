package br.com.bytebank.modelo

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
        }
            println("Falha na autenticação")
    }


}