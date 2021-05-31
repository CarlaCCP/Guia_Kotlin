import br.com.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
//    var enderecoNulo: Endereco? = null
//    enderecoNulo!!.logradouro // não recomendavel
//    val enderecoNaoNulo: Endereco = enderecoNulo!!
//    enderecoNaoNulo.logradouro

    // Safe call
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    println(enderecoNulo?.logradouro?.length) // checa se é nulo e depois faz o restante

    // outra forma, funções de scopo com lambda
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        // Elvis Operator
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }





}





















