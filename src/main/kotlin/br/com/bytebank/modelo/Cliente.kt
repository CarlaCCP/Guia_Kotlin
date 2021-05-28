package br.com.bytebank.modelo

class Cliente (
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(), // para que o endereco não seja obrigatorio na inicializacao de cliente
   protected val senha: Int

): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false

    }

}