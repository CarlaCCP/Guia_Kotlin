import br.com.bytebank.modelo.Endereco


fun main() {
    println("Bem vindo ao ByteBank")
    val endereco = Endereco("Rua tal", 0,"9863", cep= "0001")
    val enderecoNovo = Endereco("Rua outraRua", 0,"9863", cep= "0002")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode()) // como se fosse seu identificador
    println(endereco.toString()) // tudo é passa por um print usa toString

}
fun imprime(valor: Any) : Any{
    println(valor)
    return valor
} // tudo que pode ser objeto, que é um classe, recebe o Any como superclass
//fun imprime(valor: Int){}
//fun imprime(valor: Double){}












