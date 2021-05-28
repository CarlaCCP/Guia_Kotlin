package br.com.bytebank.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set


    fun registra(funcionario: Any){
        if (funcionario is Funcionario) { // casting,com o any é necessario converter o objeto em um tipo esperado
            this.total += funcionario.bonificacao()
        }

    }

    // Tanto gerente quanto diretor são funcionarios
    // Então não precisa especificar
//    fun registra(gerente: br.com.bytebank.modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: br.com.bytebank.modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }


}